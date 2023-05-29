package app.services.impl;

import app.model.StatusFlights;
import app.model.StatusOperability;
import app.services.StatusFlightsService;
import app.services.StatusOperabilityService;
import app.services.impl.api.StatusFlightsServiceApi;
import app.services.impl.api.StatusOperabilityServiceApi;

public class StatusOperabilityServiceImpl
        extends AbstractCrudServiceImpl<StatusOperability>
        implements StatusOperabilityService {

    public StatusOperabilityServiceImpl(String baseUrl) {
        super(StatusOperabilityServiceApi.class, StatusOperability.class, baseUrl, "statusOperability");
    }
}
