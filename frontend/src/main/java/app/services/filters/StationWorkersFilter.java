package app.services.filters;

import app.model.Brigades;
import app.model.Department;
import app.model.Trains;
import app.model.Work;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class StationWorkersFilter implements Filter {
    Department department;
    Brigades brigades;
    Trains trains;
    Work work;

    //    ProductTypeEnum productTypeEnum;
//    ProductStatusEnum productStatusEnum;
//    Date minAssembledDate;
//    Date maxAssembledDate;
//
//    Laboratory laboratory;
//    Date minLaboratoryDate;
//    Date maxLaboratoryDate;
//
}