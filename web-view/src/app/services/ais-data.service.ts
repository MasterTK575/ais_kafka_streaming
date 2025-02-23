import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {AisStreamData} from "../models/ais-stream-aggregation";

@Injectable({
  providedIn: 'root',
})
export class AisDataService {

  public readonly AIS_DATA_STREAM_URI = 'http://localhost:8080/ais-stream';

  // constructor(private readonly httpClient: HttpClient) {
  // } // TODO doesn't work yet...

  // TODO: doesn't quite work yet...
  // localhost/:1 Access to resource at 'http://localhost:8080/ais-stream' from origin
  // 'http://localhost:4200' has been blocked by CORS policy: No 'Access-Control-Allow-Origin'
  // header is present on the requested resource.
  public getAisDataStream(): Observable<AisStreamData> {
    return new Observable(observer => {
      const eventSource = new EventSource(this.AIS_DATA_STREAM_URI);

      eventSource.onmessage = event => {
        const data: AisStreamData = JSON.parse(event.data);
        observer.next(data);
      };

      eventSource.onerror = error => {
        observer.error(error);
      };

      return () => eventSource.close();
    });
  }

  // public updateAisSubscription(subscriptionMessage: AisSubscriptionMessage): void {
  //   this.httpClient.post(this.AIS_DATA_STREAM_URI, subscriptionMessage).subscribe(); // TODO
  // }
}
