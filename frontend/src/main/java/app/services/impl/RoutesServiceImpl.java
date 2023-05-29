package app.services.impl;

import app.model.Routes;
import app.services.RoutesService;
import app.services.impl.api.RoutesServiceApi;

public class RoutesServiceImpl
        extends AbstractCrudServiceImpl<Routes>
        implements RoutesService {

    public RoutesServiceImpl(String baseUrl) {
        super(RoutesServiceApi.class, Routes.class, baseUrl, "routes");
    }
}
