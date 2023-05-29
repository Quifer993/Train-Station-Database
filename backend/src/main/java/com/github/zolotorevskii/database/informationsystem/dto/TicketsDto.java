package com.github.zolotorevskii.database.informationsystem.dto;

import com.github.zolotorevskii.database.informationsystem.entity.Flight;
import com.github.zolotorevskii.database.informationsystem.entity.Passengers;
import com.github.zolotorevskii.database.informationsystem.entity.Stations;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPassengers;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TicketsDto extends AbstractDto {
    private Long price;
    private Long placeRailwayCarriage;
    private Long railwayCarriage;

    private String luggage;

    private FlightDto flight;

    private PassengersDto passengers;
    private StatusPassengersDto statusPassengers;

    private LocalDate timeBooking;
    private LocalDate timeSale;
    private LocalDate timeTicketReturn;

    private StationsDto startStation;
    private StationsDto finishStation;
}
