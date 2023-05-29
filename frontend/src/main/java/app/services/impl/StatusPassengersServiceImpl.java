package app.services.impl;

import app.model.Department;
import app.model.StatusPassengers;
import app.model.StatusPreparation;
import app.services.DepartmentService;
import app.services.StatusPassengersService;
import app.services.impl.api.StatusPassengersServiceApi;

public class StatusPassengersServiceImpl
        extends AbstractCrudServiceImpl<StatusPassengers>
        implements StatusPassengersService {

    public StatusPassengersServiceImpl(String baseUrl) {
        super(StatusPassengersServiceApi.class, StatusPassengers.class, baseUrl, "statusPassengers");
    }
}
