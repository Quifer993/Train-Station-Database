package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "\"Tickets\"")
public class Tickets extends AbstractEntity {
    @Column(name = "\"price\"", nullable = false)
    private Long price;

    @Column(name = "\"place_railway_carriage\"", nullable = false)
    private Long placeRailwayCarriage;

    @Column(name = "\"railway_carriage\"", nullable = false)
    private Long railwayCarriage;

    @Column(name = "\"luggage\"", length = 1, nullable = false, columnDefinition = "VARCHAR2(1) DEFAULT 'F'")
    private String luggage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_flight\"", referencedColumnName = "\"id\"")
    private Flight flight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_passenger\"", referencedColumnName = "\"id\"")
    private Passengers passengers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_status_passenger\"", referencedColumnName = "\"id\"")
    private StatusPassengers statusPassengers;

    @Column(name = "\"time_booking\"", nullable = false, columnDefinition = "DATE() DEFAULT NOW()")
    private LocalDate timeBooking;

    @Column(name = "\"time_sale\"", nullable = true)
    private LocalDate timeSale;

    @Column(name = "\"time_ticket_return\"", nullable = true)
    private LocalDate timeTicketReturn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"start_station\"", referencedColumnName = "\"id\"")
    private Stations startStation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"finish_station\"", referencedColumnName = "\"id\"")
    private Stations finishStation;

}