package app.services.filters;

import app.model.type.ResultEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TrainDriversFilter implements Filter {
    ResultEnum resultEnum;
    Date minDate;
    Date maxDate;
}