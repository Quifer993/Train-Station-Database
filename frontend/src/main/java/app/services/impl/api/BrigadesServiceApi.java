package app.services.impl.api;

import app.model.Brigades;
import app.services.pagination.Page;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface BrigadesServiceApi extends CrudServiceApi {
//    @GET("brigades/{departmentId}")
//    Call<Page<Brigades>> getBrigadesByDepartment(
//            @Path("departmentId") Long departmentId,
//            @QueryMap Map<String, Object> pageInfo
//    );
}
