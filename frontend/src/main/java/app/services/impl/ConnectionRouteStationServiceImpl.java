package app.services.impl;

import app.model.ConnectionRouteStation;
import app.services.ConnectionRouteStationService;
import app.services.impl.api.ConnectionRouteStationServiceApi;


public class ConnectionRouteStationServiceImpl
        extends AbstractCrudServiceImpl<ConnectionRouteStation>
        implements ConnectionRouteStationService {

    private ConnectionRouteStationServiceApi getServiceApi() {
        return (ConnectionRouteStationServiceApi) getCrudServiceApi();
    }
    public ConnectionRouteStationServiceImpl(String baseUrl) {
        super(ConnectionRouteStationServiceApi.class, ConnectionRouteStation.class, baseUrl, "routeStation");
    }
}
