package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PassengersDto extends AbstractDto {
    private String sex;

    private LocalDate birthday;

    private String firstName;

    private String lastName;

    private String surname;
}
