import {PositionInformation} from "./position-information";

export interface AisStreamAggregation {
  MMSI: number;
  messageTypes: { [key: string]: number };
  positionsHistory: PositionInformation[];
  currentPosition: PositionInformation;
  messageCount: number;
}

export type AisStreamData = Record<number, AisStreamAggregation>;
