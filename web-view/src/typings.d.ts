declare module 'leaflet.boatmarker';

interface BoatMarker extends L.Marker {
    setHeading(heading: number): this;

    setHeadingWind(heading: number, windSpeed: number, windDirection: number): this;

    setSpeed(speed: number): this;
}

declare namespace L {
    function boatMarker(latlng: L.LatLngExpression, options?: any): BoatMarker;
}
