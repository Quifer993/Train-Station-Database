package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusPassengersDto extends AbstractDto {
    private String nameStatus;
    private Long discount;
}
