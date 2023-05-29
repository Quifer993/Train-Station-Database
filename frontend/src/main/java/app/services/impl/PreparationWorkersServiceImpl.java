package app.services.impl;

import app.model.PreparationWorkers;
import app.model.TrainDrivers;
import app.services.PreparationWorkersService;
import app.services.TrainDriversService;
import app.services.impl.api.PreparationWorkersServiceApi;
import app.services.impl.api.TrainDriversServiceApi;

public class PreparationWorkersServiceImpl
        extends AbstractCrudServiceImpl<PreparationWorkers>
        implements PreparationWorkersService {

    public PreparationWorkersServiceImpl(String baseUrl) {
        super(PreparationWorkersServiceApi.class, PreparationWorkers.class, baseUrl, "preparationWorkers");
    }
}
