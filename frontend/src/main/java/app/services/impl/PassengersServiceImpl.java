package app.services.impl;

import app.model.Passengers;
import app.services.PassengersService;
import app.services.impl.api.PassengersServiceApi;

public class PassengersServiceImpl
        extends AbstractCrudServiceImpl<Passengers>
        implements PassengersService {

    public PassengersServiceImpl(String baseUrl) {
        super(PassengersServiceApi.class, Passengers.class, baseUrl, "passengers");
    }
}
