package app.services.impl;

import app.model.ConnectionBrigadeWorkers;
import app.services.ConnectionBrigadeWorkersService;
import app.services.impl.api.ConnectionBrigadeWorkersServiceApi;


public class ConnectionBrigadeWorkersServiceImpl
        extends AbstractCrudServiceImpl<ConnectionBrigadeWorkers>
        implements ConnectionBrigadeWorkersService {

    private ConnectionBrigadeWorkersServiceApi getServiceApi() {
        return (ConnectionBrigadeWorkersServiceApi) getCrudServiceApi();
    }
    public ConnectionBrigadeWorkersServiceImpl(String baseUrl) {
        super(ConnectionBrigadeWorkersServiceApi.class, ConnectionBrigadeWorkers.class, baseUrl, "brigadeWorker");
    }
}
