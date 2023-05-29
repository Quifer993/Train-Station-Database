package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectionBrigadeWorkersDto extends AbstractDto {
    private StationWorkersDto stationWorkers;
    private BrigadesDto brigades;
}
