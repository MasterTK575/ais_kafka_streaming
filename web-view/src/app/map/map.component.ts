import {ChangeDetectionStrategy, ChangeDetectorRef, Component, DestroyRef} from '@angular/core';
import {LeafletModule} from "@bluehalo/ngx-leaflet";
import {LatLng, latLng, layerGroup, Map as LeafLetMap, Marker, tileLayer} from "leaflet";
import {AisDataService} from "../services/ais-data.service";
import {AisShipData, MarkerShipDataTuple} from "../models/ais-ship-data";
import {takeUntilDestroyed} from "@angular/core/rxjs-interop";
import {Subscription} from "rxjs";
import randomColor from 'randomcolor';
import "leaflet.boatmarker";
import {MatDialog} from "@angular/material/dialog";
import {DataDialogComponent} from "../data-dialog/data-dialog.component";

@Component({
    selector: 'app-map',
    imports: [LeafletModule],
    templateUrl: './map.component.html',
    styleUrl: './map.component.css',
    changeDetection: ChangeDetectionStrategy.OnPush,
})
export class MapComponent {
    protected leafLetMap?: LeafLetMap;
    protected selectedMmsi?: number;
    protected aisStreamSubscription$: Subscription | undefined;
    private shipMarkersLayerGroup = layerGroup();
    private shipMarkerAndDataMap = new Map<Number, MarkerShipDataTuple>();

    // Leaflet map configuration
    private openStreetMapBaseLayer = tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        detectRetina: true,
        attribution: '&copy; OpenStreetMap contributors'
    });
    private openSeaMapBaseLayer = tileLayer('https://tiles.openseamap.org/seamark/{z}/{x}/{y}.png', {
        detectRetina: true,
        attribution: '&copy; OpenSeaMap contributors'
    });
    protected options = {
        layers: [this.openStreetMapBaseLayer, this.openSeaMapBaseLayer],
        zoom: 5,
        center: latLng([50.816875, 11.162109]) // starts over middle europe
    };

    constructor(private readonly changeDetector: ChangeDetectorRef,
                private readonly aisDataService: AisDataService,
                private readonly destroyRef$: DestroyRef,
                private readonly dialog: MatDialog) {
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
        this.shipMarkerAndDataMap.clear();
    }

    protected requestAggregatedData(mmsi: number) {
        this.aisDataService.getAisAggregation(mmsi).subscribe((data) => {
            this.dialog.open(DataDialogComponent, {
                maxWidth: '650px',
                width: '650px',
                data: {aggregatedData: data}
            });
        });
    }

    private createServerSentEventsSubscription(): Subscription {
        return this.aisDataService.subscribeToAisStream().pipe(takeUntilDestroyed(this.destroyRef$)).subscribe((aisShipData: AisShipData) => {
            this.updateOrCreateMarker(aisShipData);
        });
    }

    private updateOrCreateMarker(aisShipData: AisShipData): void {
        const markerShipDataTuple = this.shipMarkerAndDataMap.get(aisShipData.mmsi);
        if (markerShipDataTuple) {
            this.updateMarkerAndShipData(aisShipData, markerShipDataTuple.boatMarker);
            return;
        }

        const position = aisShipData.currentPosition;
        if (!position) {
            return;
        }

        const boatMarker = L.boatMarker([position.latitude, position.longitude], {
            color: randomColor(),
            idleCircle: true,
        });
        boatMarker.setHeading(position.trueHeading);
        boatMarker.setSpeed(position.speedOverGround);

        this.shipMarkerAndDataMap.set(aisShipData.mmsi, {boatMarker, aisShipData});
        this.shipMarkersLayerGroup.addLayer(boatMarker);
        this.attachEventListener(boatMarker, aisShipData.mmsi);
    }

    private updateMarkerAndShipData(aisShipData: AisShipData, boatMarker: BoatMarker): void {
        this.shipMarkerAndDataMap.set(aisShipData.mmsi, {boatMarker, aisShipData});

        const positionInformation = aisShipData.currentPosition;
        if (!positionInformation) {
            return
        }
        boatMarker.setLatLng([positionInformation.latitude, positionInformation.longitude]);
        boatMarker.setHeading(positionInformation.trueHeading);
        boatMarker.setSpeed(positionInformation.speedOverGround);
    }

    private attachEventListener(marker: Marker, mmsi: number) {
        marker.bindTooltip("Loading...");

        marker.on('tooltipopen', () => {
            const tooltip = marker.getTooltip();
            if (!tooltip) {
                console.error('Tooltip not found');
                return;
            }

            // Get the latest ship data
            const tuple = this.shipMarkerAndDataMap.get(mmsi);
            const aisShipData = tuple?.aisShipData;
            const position = aisShipData?.currentPosition;
            if (!aisShipData || !position) {
                console.error('No Data to display in tooltip');
                return;
            }

            tooltip.setContent(`
              <div>
                <strong>MMSI:</strong> ${aisShipData.mmsi}<br>
                <strong>Ship Name:</strong> ${aisShipData.shipName ?? "-"}<br>
                <strong>Ship Type:</strong> ${aisShipData.shipType ?? "-"}<br>
                <strong>Destination:</strong> ${aisShipData.destination ?? "-"}<br>
                <strong>ETA:</strong> ${aisShipData.eta ?? "-"}<br>
                <strong>LatLng:</strong> (${position.latitude}, ${position.longitude})<br>
                <strong>Heading:</strong> ${position.trueHeading}<br>
                <strong>Speed:</strong> ${position.speedOverGround}<br>
                <strong>Navigational Status:</strong> ${aisShipData.navigationalStatus ?? "-"}<br>
                <strong>TimeStamp:</strong> ${aisShipData.timestamp ?? "-"}<br>
              </div>
            `);
        });

        marker.on('click', () => {
            this.leafLetMap?.setView(marker.getLatLng(), Math.max(12, this.leafLetMap?.getZoom() ?? 12), {animate: true});
            this.selectedMmsi = mmsi;
        });
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
}
