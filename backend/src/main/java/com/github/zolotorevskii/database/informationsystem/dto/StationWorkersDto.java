package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;
import oracle.sql.DATE;

import java.time.LocalDate;

@Getter
@Setter
public class StationWorkersDto extends AbstractDto {
    private String sex;

    private Long amountChildren;

    private LocalDate birthday;

    private Long salary;

    private String firstName;

    private String lastName;

    private String surname;

    private LocalDate hireDate;

    private WorkDto work;
}
