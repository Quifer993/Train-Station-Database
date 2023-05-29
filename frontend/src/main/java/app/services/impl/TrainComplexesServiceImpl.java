package app.services.impl;

import app.model.TrainComplexes;
import app.model.Work;
import app.services.TrainComplexesService;
import app.services.WorkService;
import app.services.impl.api.TrainComplexesServiceApi;
import app.services.impl.api.WorkServiceApi;

public class TrainComplexesServiceImpl
        extends AbstractCrudServiceImpl<TrainComplexes>
        implements TrainComplexesService {

    public TrainComplexesServiceImpl(String baseUrl) {
        super(TrainComplexesServiceApi.class, TrainComplexes.class, baseUrl, "trainComplexes");
    }
}
