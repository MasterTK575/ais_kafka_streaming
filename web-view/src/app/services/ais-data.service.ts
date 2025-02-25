import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {AisStreamAggregation} from "../models/ais-stream-aggregation";
import {HttpClient} from "@angular/common/http";
import {AisSubscriptionAction} from "../models/ais-subscription-message";

@Injectable({
  providedIn: 'root',
})
export class AisDataService {

  // TODO: adjust this when using docker
  public readonly AIS_DATA_STREAM_URI = 'http://localhost:8080/ais-stream';

  constructor(private readonly httpClient: HttpClient) {
  }

  public subscribeToAisStream(): Observable<AisStreamAggregation> {
    return new Observable(observer => {
      const eventSource = new EventSource(this.AIS_DATA_STREAM_URI);

      eventSource.onmessage = event => {
        const data: AisStreamAggregation = JSON.parse(event.data); // TODO error handling
        observer.next(data);
      };

      eventSource.onerror = error => {
        observer.error(error);
      };

      return () => eventSource.close();
    });
  }

  public setOrUpdateAisStreamSubscription(aisSubscriptionAction: AisSubscriptionAction): Observable<any> {
    return this.httpClient.post(this.AIS_DATA_STREAM_URI, aisSubscriptionAction);
  }
}
