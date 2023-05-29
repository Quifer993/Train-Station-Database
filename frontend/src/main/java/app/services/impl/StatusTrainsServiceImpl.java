package app.services.impl;

import app.model.StatusTrains;
import app.services.StatusTrainsService;
import app.services.impl.api.StatusTrainsServiceApi;

public class StatusTrainsServiceImpl
        extends AbstractCrudServiceImpl<StatusTrains>
        implements StatusTrainsService {

    public StatusTrainsServiceImpl(String baseUrl) {
        super(StatusTrainsServiceApi.class, StatusTrains.class, baseUrl, "statusTrains");
    }
}
