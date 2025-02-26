import {PositionInformation} from "./position-information";

export interface AisShipData {
    mmsi: number;
    shipName: string | null;
    destination: string | null;
    eta: string | null;
    currentPosition: PositionInformation | null;
    navigationalStatus: string | null;
    timestamp: string | null;
}

export interface MarkerShipDataTuple {
    boatMarker: BoatMarker;
    aisShipData: AisShipData;
}
