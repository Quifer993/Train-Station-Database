package com.github.zolotorevskii.database.informationsystem.filter;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StationWorkersFilter {
    DepartmentDto department;
    BrigadesDto brigades;
    TrainsDto trains;
    Work work;
}
