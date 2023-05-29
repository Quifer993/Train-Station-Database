package com.github.zolotorevskii.database.informationsystem.filter;

import com.github.zolotorevskii.database.informationsystem.dto.RoutesDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightFilter {
    RoutesDto routes;
    StatusFlightsDto statusFlights;
    StatusTrainsDto statusTrains;
}
