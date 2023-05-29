package com.github.zolotorevskii.database.informationsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FlightDto extends AbstractDto {
    private Long priceFlight;
    private LocalDate timeStart;

    private StatusPreparationDto statusPreparation;
    private StatusOperabilityDto statusOperability;
    private StatusFlightsDto statusFlights;
    private TrainsDto trains;
    private RoutesDto routes;
}
