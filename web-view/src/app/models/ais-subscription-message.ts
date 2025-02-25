export interface AisSubscriptionMessage {
  apIKey: string;
  boundingBoxes: number[][][];
  filtersShipMMSI?: number[];
  filterMessageTypes?: string[];
}

export interface AisSubscriptionAction {
  keepAlive: boolean;
  aisSubscriptionMessage: AisSubscriptionMessage | null;
}
