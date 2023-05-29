package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrigadesDto extends AbstractDto {
    private DepartmentDto department;
}
