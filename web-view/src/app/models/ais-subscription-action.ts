export interface AisSubscriptionAction {
    closeConnection: boolean;
    boundingBoxes?: number[][][];
    filtersShipMMSI?: number[];
    filterMessageTypes?: string[];
}
