export const environment = {
    // @ts-ignore
    aisStreamUri: window["env"]["aisStreamUri"] || "http://localhost:8080",
    // @ts-ignore
    aisAggregationUri: window["env"]["aisAggregationUri"] || "http://localhost:8082",
    // @ts-ignore
    debug: window["env"]["debug"] || false
};
