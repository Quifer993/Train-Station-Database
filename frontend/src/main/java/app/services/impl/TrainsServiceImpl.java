package app.services.impl;

import app.model.Brigades;
import app.model.Trains;
import app.services.BrigadesService;
import app.services.ServiceResponse;
import app.services.TrainsService;
import app.services.impl.api.BrigadesServiceApi;
import app.services.impl.api.TrainsServiceApi;
import app.services.pagination.Page;
import app.services.pagination.PageInfo;


public class TrainsServiceImpl
        extends AbstractCrudServiceImpl<Trains>
        implements TrainsService {

    private TrainsServiceApi getServiceApi() {
        return (TrainsServiceApi) getCrudServiceApi();
    }
    public TrainsServiceImpl(String baseUrl) {
        super(TrainsServiceApi.class, Trains.class, baseUrl, "trains");
    }
}
