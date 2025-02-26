declare module 'leaflet.boatmarker';

interface BoatMarker extends L.Marker {
    setHeading(heading: number): void;

    setHeadingWind(heading: number, windSpeed: number, windDirection: number): void;

    setSpeed(speed: number): void;
}

declare namespace L {
    function boatMarker(latlng: L.LatLngExpression, options?: any): BoatMarker;
}
