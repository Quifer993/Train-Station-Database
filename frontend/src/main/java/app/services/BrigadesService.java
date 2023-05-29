package app.services;

import app.model.Brigades;
import app.services.pagination.Page;
import app.services.pagination.PageInfo;


public interface BrigadesService extends Service<Brigades> {
    ServiceResponse<Page<Brigades>> getBrigadesByDepartment(Long id, PageInfo pageInfo);
}
