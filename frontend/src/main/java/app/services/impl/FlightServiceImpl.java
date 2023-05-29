package app.services.impl;

import app.model.Department;
import app.model.Flight;
import app.services.DepartmentService;
import app.services.FlightService;
import app.services.impl.api.DepartmentServiceApi;
import app.services.impl.api.FlightServiceApi;

public class FlightServiceImpl
        extends AbstractCrudServiceImpl<Flight>
        implements FlightService {

    public FlightServiceImpl(String baseUrl) {
        super(FlightServiceApi.class, Flight.class, baseUrl, "flight");
    }
}
