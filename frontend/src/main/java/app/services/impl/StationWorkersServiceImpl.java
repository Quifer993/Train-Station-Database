package app.services.impl;

import app.model.StationWorkers;
import app.services.StationWorkersService;
import app.services.impl.api.StationWorkersServiceApi;

public class StationWorkersServiceImpl
        extends AbstractCrudServiceImpl<StationWorkers>
        implements StationWorkersService {

    public StationWorkersServiceImpl(String baseUrl) {
        super(StationWorkersServiceApi.class, StationWorkers.class, baseUrl, "employee");
    }
}
