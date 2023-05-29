package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TrainsDto extends AbstractDto {
    private StatusTrainsDto statusTrains;

    private Long placesInRailwayCarriage;
    private Long capacityRailwayCarriage;

    private BrigadesDto brigadeTrainDrivers;
    private BrigadesDto brigadeOperability;
    private BrigadesDto brigadePreparation;

    private StationsDto stations;

}
