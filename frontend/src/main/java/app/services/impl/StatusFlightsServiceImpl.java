package app.services.impl;

import app.model.StatusFlights;
import app.services.StatusFlightsService;
import app.services.impl.api.StatusFlightsServiceApi;

public class StatusFlightsServiceImpl
        extends AbstractCrudServiceImpl<StatusFlights>
        implements StatusFlightsService {

    public StatusFlightsServiceImpl(String baseUrl) {
        super(StatusFlightsServiceApi.class, StatusFlights.class, baseUrl, "statusFlights");
    }
}
