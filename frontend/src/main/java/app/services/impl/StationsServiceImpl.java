package app.services.impl;

import app.model.Stations;
import app.services.StationsService;
import app.services.impl.api.StationsServiceApi;

public class StationsServiceImpl
        extends AbstractCrudServiceImpl<Stations>
        implements StationsService {

    public StationsServiceImpl(String baseUrl) {
        super(StationsServiceApi.class, Stations.class, baseUrl, "stations");
    }
}
