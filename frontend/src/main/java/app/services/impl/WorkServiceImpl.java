package app.services.impl;

import app.model.Work;
import app.services.WorkService;
import app.services.impl.api.WorkServiceApi;

public class WorkServiceImpl
        extends AbstractCrudServiceImpl<Work>
        implements WorkService {

    public WorkServiceImpl(String baseUrl) {
        super(WorkServiceApi.class, Work.class, baseUrl, "work");
    }
}
