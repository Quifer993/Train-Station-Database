package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectionRouteStationDto extends AbstractDto {
    private RoutesDto routes;
    private StationsDto stations;

    private Long numberStationFromStart;
    private Long timeToNextStation;
    private Long timeWait;
}
