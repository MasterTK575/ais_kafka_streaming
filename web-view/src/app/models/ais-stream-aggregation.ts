import {PositionInformation} from "./position-information";

export interface AisStreamAggregation {
    mmsi: number;
    orderedMessages: { [key: string]: any[] };
    positionsHistory: PositionInformation[];
    currentPosition: PositionInformation | null;
    messageCount: number;
}
