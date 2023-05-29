package app.services.impl;

import app.model.Brigades;
import app.services.BrigadesService;
import app.services.ServiceResponse;
import app.services.impl.api.BrigadesServiceApi;
import app.services.pagination.Page;
import app.services.pagination.PageInfo;


public class BrigadesServiceImpl
        extends AbstractCrudServiceImpl<Brigades>
        implements BrigadesService {

    private BrigadesServiceApi getServiceApi() {
        return (BrigadesServiceApi) getCrudServiceApi();
    }
    public BrigadesServiceImpl(String baseUrl) {
        super(BrigadesServiceApi.class, Brigades.class, baseUrl, "brigades");
    }
//    @Override
//    public ServiceResponse<Page<Brigades>> getBrigadesByDepartment(Long departmentId, PageInfo pageInfo) {
//        var call = getServiceApi().getBrigadesByDepartment(departmentId, PageInfo.toMap(pageInfo));
//        return getServerResponse(call);
//    }
    @Override
    public ServiceResponse<Page<Brigades>> getBrigadesByDepartment(Long id, PageInfo pageInfo) {
        return null;
    }
}
