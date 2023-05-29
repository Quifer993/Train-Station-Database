package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "\"Flight\"")
//@SecondaryTable(name = "\"Preparation_workerss\"",
//        pkJoinColumns = @PrimaryKeyJoinColumn(name = "\"id\"",
//                referencedColumnName = "\"id\""))
public class Flight extends AbstractEntity {
    @Column(name = "\"price_flight\"", nullable = false)
    private Long priceFlight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"result_preparation\"", referencedColumnName = "\"id\"")
    private StatusPreparation statusPreparation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"result_operability\"", referencedColumnName = "\"id\"")
    private StatusOperability statusOperability;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_status_flight\"", referencedColumnName = "\"id\"")
    private StatusFlights statusFlights;

    @Column(name = "\"time_start\"", nullable = false)
    private LocalDate timeStart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_train\"", referencedColumnName = "\"id\"")
    private Trains trains;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_route\"", referencedColumnName = "\"id\"")
    private Routes routes;
}