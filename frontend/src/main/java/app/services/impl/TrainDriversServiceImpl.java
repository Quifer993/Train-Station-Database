package app.services.impl;

import app.model.TrainDrivers;
import app.model.Work;
import app.services.TrainDriversService;
import app.services.WorkService;
import app.services.impl.api.TrainDriversServiceApi;
import app.services.impl.api.WorkServiceApi;

public class TrainDriversServiceImpl
        extends AbstractCrudServiceImpl<TrainDrivers>
        implements TrainDriversService {

    public TrainDriversServiceImpl(String baseUrl) {
        super(TrainDriversServiceApi.class, TrainDrivers.class, baseUrl, "trainDrivers");
    }
}
