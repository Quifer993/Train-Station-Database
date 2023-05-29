package com.github.zolotorevskii.database.informationsystem.filter;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import com.github.zolotorevskii.database.informationsystem.filter.type.ResultEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TrainDriversFilter {
    ResultEnum resultEnum;
    Date minDate;
    Date maxDate;
}
