import {ChangeDetectionStrategy, ChangeDetectorRef, Component, DestroyRef, EventEmitter} from '@angular/core';
import {LeafletModule} from "@bluehalo/ngx-leaflet";
import {icon, LatLng, latLng, layerGroup, Map as LeafLetMap, Marker, marker, polyline, tileLayer} from "leaflet";
import {FormsModule} from "@angular/forms";
import {AisDataService} from "../services/ais-data.service";
import {AisStreamAggregation} from "../models/ais-stream-aggregation";
import {takeUntilDestroyed} from "@angular/core/rxjs-interop";
import {takeUntil} from "rxjs";
import {PositionInformation} from "../models/position-information";
import {AisSubscriptionAction} from "../models/ais-subscription-message";

@Component({
  selector: 'app-map',
  imports: [LeafletModule, FormsModule],
  templateUrl: './map.component.html',
  styleUrl: './map.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class MapComponent {
// TODO: change detection
  protected leafLetMap?: LeafLetMap;
  protected latitude = 50.816875;
  protected longitude = 11.162109;
  protected formZoom = 5;
  private closeConnection = new EventEmitter<void>();
  private shipMarkersLayerGroup = layerGroup();
  private shipMarkersMap = new Map<Number, Marker>();

  // Define our base layers so we can reference them multiple times
  openStreetMapBaseLayer = tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    detectRetina: true,
    attribution: '&copy; OpenStreetMap contributors'
  });

  // Path from paradise to summit - most points omitted from this example for brevity
  route = polyline([[46.78465227596462, -121.74141269177198],
    [46.80047278292477, -121.73470708541572],
    [46.815471360459924, -121.72521826811135],
    [46.8360239546746, -121.7323131300509],
    [46.844306448474526, -121.73327445052564],
    [46.84979408048093, -121.74325201660395],
    [46.853193528950214, -121.74823296256363],
    [46.85322881676257, -121.74843915738165],
    [46.85119913890958, -121.7519719619304],
    [46.85103829018772, -121.7542376741767],
    [46.85101557523012, -121.75431755371392],
    [46.85140013694763, -121.75727385096252],
    [46.8525277543813, -121.75995212048292],
    [46.85290292836726, -121.76049157977104],
    [46.8528160918504, -121.76042997278273]]);

  protected layersControl = {
    baseLayers: {
      'Street Maps': this.openStreetMapBaseLayer,
    },
    overlays: {'Ships': this.shipMarkersLayerGroup}
  };

  // TODO: ship markers:
  // maybe add a route (polyline)? to show the history?
  // also maybe ad an onclick callback to the marker?
  // i.e. for zooming or doing something else: this.circle.on('add', () => { this.map.fitBounds(this.circle.getBounds()); });

  protected options = {
    layers: [this.openStreetMapBaseLayer],
    zoom: this.formZoom,
    center: latLng([this.latitude, this.longitude])
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
    // leafLetMap.fitBounds(this.route.getBounds(), {
    //   padding: point(24, 24),
    //   maxZoom: 12,
    //   animate: true
    // });
  }

  protected subscribeToOrUpdateAisStreamConnection() {
    const boundingBox = this.buildBoundingBox();
    if (!boundingBox) {
      console.error('Could not build bounding box');
      return;
    }
    this.aisDataService.setOrUpdateAisStreamSubscription(this.buildAisSubscriptionAction(true, boundingBox)).pipe(takeUntilDestroyed(this.destroyRef$)).subscribe();
    this.aisDataService.subscribeToAisStream().pipe(takeUntilDestroyed(this.destroyRef$), takeUntil(this.closeConnection)).subscribe((aisStreamData: AisStreamAggregation) => {
      console.log(aisStreamData);
      if (!aisStreamData.currentPosition) {
        return;
      }
      this.updateOrCreateMarker(aisStreamData.mmsi, aisStreamData.currentPosition);
    });
  }

  protected stopRequestingAisData() {
    this.closeConnection.emit();
    this.aisDataService.setOrUpdateAisStreamSubscription(this.buildAisSubscriptionAction(false)).pipe(takeUntilDestroyed(this.destroyRef$)).subscribe();
  }

  private updateOrCreateMarker(mmsi: number, position: PositionInformation): void {
    let shipMarker = this.shipMarkersMap.get(mmsi);
    if (shipMarker) {
      shipMarker.setLatLng([position.latitude, position.longitude]);
      return;
    }

    // TODO: change marker icon
    shipMarker = marker([position.latitude, position.longitude], {
      icon: icon({
        iconSize: [25, 41],
        iconAnchor: [13, 41],
        iconUrl: 'leaflet/marker-icon.png',
        iconRetinaUrl: 'leaflet/marker-icon-2x.png',
        shadowUrl: 'leaflet/marker-shadow.png'
      })
    });

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
    return [[northWest.lat, northWest.lng], [southEast.lat, northWest.lng]];
  }

  private buildAisSubscriptionAction(keepAlive = true, boundingBox?: number[][]): AisSubscriptionAction {
    return keepAlive && boundingBox ? {
      keepAlive,
      aisSubscriptionMessage: {
        apIKey: '',
        boundingBoxes: [boundingBox]
      }
    } : {
      keepAlive,
      aisSubscriptionMessage: null,
    }
  };
}
