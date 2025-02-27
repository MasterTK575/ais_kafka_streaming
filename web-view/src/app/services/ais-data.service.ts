import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {AisShipData} from "../models/ais-ship-data";
import {HttpClient} from "@angular/common/http";
import {AisSubscriptionAction} from "../models/ais-subscription-action";
import {environment} from "../../environments/environemnt";

@Injectable({
    providedIn: 'root',
})
export class AisDataService {

    public readonly AIS_DATA_STREAM_URI = `${environment.aisStreamUri}/ais-stream`;
    public readonly AIS_AGGREGATION_URI = `${environment.aisAggregationUri}/aggregation`;

    constructor(private readonly httpClient: HttpClient) {
    }

    public subscribeToAisStream(): Observable<AisShipData> {
        return new Observable(observer => {
            const eventSource = new EventSource(this.AIS_DATA_STREAM_URI);

            eventSource.onmessage = event => {
                let data: AisShipData;
                try {
                    data = JSON.parse(event.data);
                } catch (e) {
                    console.error('Error while parsing AIS data', e);
                    return;
                }
                observer.next(data);
            };

            eventSource.onerror = error => {
                observer.error(error);
            };

            return () => eventSource.close();
        });
    }

    public setOrUpdateAisStreamSubscription(boundingBox: number[][]): void {
        this.makeRequest(this.buildAisSubscriptionAction(false, boundingBox));
    }

    public closeAisStreamSubscription(): void {
        this.makeRequest(this.buildAisSubscriptionAction(true));
    }

    public getAisAggregation(mmsi: number): Observable<any> {
        return this.httpClient.get(`${this.AIS_AGGREGATION_URI}/${mmsi}`);
    }

    private makeRequest(aisSubscriptionAction: AisSubscriptionAction): void {
        this.httpClient.post(this.AIS_DATA_STREAM_URI, aisSubscriptionAction).subscribe({
            error: err => {
                console.error('Error while setting/updating AIS subscription', err);
            }
        });
    }

    private buildAisSubscriptionAction(closeConnection = false, boundingBox?: number[][]): AisSubscriptionAction {
        return {
            closeConnection: closeConnection,
            boundingBoxes: boundingBox ? [boundingBox] : undefined,
        }
    };
}
