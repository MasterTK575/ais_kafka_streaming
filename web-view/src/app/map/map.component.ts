import {ChangeDetectionStrategy, ChangeDetectorRef, Component, DestroyRef} from '@angular/core';
import {LeafletModule} from "@bluehalo/ngx-leaflet";
import {LatLng, latLng, layerGroup, Map as LeafLetMap, Marker, tileLayer} from "leaflet";
import {FormsModule} from "@angular/forms";
import {AisDataService} from "../services/ais-data.service";
import {AisStreamAggregation} from "../models/ais-stream-aggregation";
import {takeUntilDestroyed} from "@angular/core/rxjs-interop";
import {Subscription} from "rxjs";
import {PositionInformation} from "../models/position-information";
import randomColor from 'randomcolor';
import "leaflet.boatmarker";

@Component({
    selector: 'app-map',
    imports: [LeafletModule, FormsModule],
    templateUrl: './map.component.html',
    styleUrl: './map.component.css',
    changeDetection: ChangeDetectionStrategy.OnPush,
})
export class MapComponent {
    protected leafLetMap?: LeafLetMap;
    private shipMarkersLayerGroup = layerGroup();
    private shipMarkersMap = new Map<Number, BoatMarker>();
    private aisStreamSubscription$: Subscription | undefined;

    // Leaflet map configuration
    private openStreetMapBaseLayer = tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        detectRetina: true,
        attribution: '&copy; OpenStreetMap contributors'
    });
    private openSeaMapBaseLayer = tileLayer('https://tiles.openseamap.org/seamark/{z}/{x}/{y}.png', {
        detectRetina: true,
        attribution: '&copy; OpenSeaMap contributors'
    });
    protected layersControl = {
        baseLayers: {
            'Street Map': this.openStreetMapBaseLayer,
        },
        overlays: {'Ships': this.shipMarkersLayerGroup}
    };
    protected options = {
        layers: [this.openStreetMapBaseLayer, this.openSeaMapBaseLayer],
        zoom: 5,
        center: latLng([50.816875, 11.162109]) // starts over middle europe
    };

    constructor(private readonly changeDetector: ChangeDetectorRef,
                private readonly aisDataService: AisDataService,
                private readonly destroyRef$: DestroyRef) {
    }

    protected onCenterChange(center: LatLng) {
        // no actions needed, will update the view due to change detection
    }

    protected onMapReady(leafLetMap: LeafLetMap) {
        this.leafLetMap = leafLetMap;
        this.changeDetector.detectChanges();
        this.leafLetMap.addLayer(this.shipMarkersLayerGroup);
    }

    protected subscribeToOrUpdateAisStreamConnection() {
        const boundingBox = this.buildBoundingBox();
        if (!boundingBox) {
            console.error('Could not build bounding box');
            return;
        }
        if (!this.aisStreamSubscription$) {
            this.aisStreamSubscription$ = this.createServerSentEventsSubscription();
        }
        this.aisDataService.setOrUpdateAisStreamSubscription(boundingBox);
    }

    protected stopRequestingAisData() {
        this.aisStreamSubscription$?.unsubscribe();
        this.aisStreamSubscription$ = undefined;
        this.aisDataService.closeAisStreamSubscription();
    }

    protected clearMarkers() {
        this.shipMarkersLayerGroup.clearLayers();
        this.shipMarkersMap.clear();
    }

    private createServerSentEventsSubscription(): Subscription {
        return this.aisDataService.subscribeToAisStream().pipe(takeUntilDestroyed(this.destroyRef$)).subscribe((aisStreamData: AisStreamAggregation) => {
            console.log(aisStreamData);
            if (!aisStreamData.currentPosition) {
                return;
            }
            this.updateOrCreateMarker(aisStreamData.mmsi, aisStreamData.currentPosition);
        });
    }

    private updateOrCreateMarker(mmsi: number, position: PositionInformation): void {
        let shipMarker = this.shipMarkersMap.get(mmsi);
        if (shipMarker) {
            shipMarker.setLatLng([position.latitude, position.longitude]);
            shipMarker.setHeading(position.trueHeading);
            shipMarker.setSpeed(position.speedOverGround);
            return;
        }

        shipMarker = L.boatMarker([position.latitude, position.longitude], {
            color: randomColor(),
            idleCircle: true,
        });
        shipMarker.setHeading(position.trueHeading);
        shipMarker.setSpeed(position.speedOverGround);

        this.attachEventListener(shipMarker, mmsi, position);
        this.shipMarkersMap.set(mmsi, shipMarker);
        this.shipMarkersLayerGroup.addLayer(shipMarker);
    }

    private buildBoundingBox(): number[][] | undefined {
        const bounds = this.leafLetMap?.getBounds();
        if (!bounds) {
            return undefined;
        }
        const northWest = bounds.getNorthWest();
        const southEast = bounds.getSouthEast();
        return [[northWest.lat, northWest.lng], [southEast.lat, southEast.lng]];
    }

    private attachEventListener(marker: Marker, mmsi: number, position: PositionInformation) {
        marker.bindTooltip(`
              <div>
                <strong>MMSI:</strong> ${mmsi}<br>
                <strong>Ship Name:</strong> ${mmsi}<br>
                <strong>LatLng:</strong> (${position.latitude}, ${position.longitude})<br>
                <strong>Heading:</strong> ${position.trueHeading}<br>
                <strong>Speed:</strong> ${position.speedOverGround}<br>
              </div>
            `);

        marker.on('click', () => {
            this.leafLetMap?.setView(marker.getLatLng(), this.leafLetMap?.getZoom() + 1, {animate: true});
            marker.openTooltip();
        });
    }
}
