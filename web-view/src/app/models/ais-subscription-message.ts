export interface AisSubscriptionMessage {
  boundingBoxes: number[][][];
  filtersShipMMSI?: number[];
  filterMessageTypes?: string[];
}
