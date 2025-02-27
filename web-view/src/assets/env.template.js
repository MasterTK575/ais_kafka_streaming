(function (window) {
    window["env"] = window["env"] || {};

    // Environment variables
    window["env"]["aisStreamUri"] = "${AIS_STREAM_URI}";
    window["env"]["aisAggregationUri"] = "${AIS_AGGREGATION_URI}";
    window["env"]["debug"] = "${DEBUG}";
})(this);
