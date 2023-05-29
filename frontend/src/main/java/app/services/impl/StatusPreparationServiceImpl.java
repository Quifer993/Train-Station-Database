package app.services.impl;

import app.model.StatusPreparation;
import app.services.DepartmentService;
import app.services.StatusPreparationService;
import app.services.impl.api.DepartmentServiceApi;
import app.services.impl.api.StatusPreparationServiceApi;

public class StatusPreparationServiceImpl
        extends AbstractCrudServiceImpl<StatusPreparation>
        implements StatusPreparationService {

    public StatusPreparationServiceImpl(String baseUrl) {
        super(StatusPreparationServiceApi.class, StatusPreparation.class, baseUrl, "statusPreparation");
    }
}
