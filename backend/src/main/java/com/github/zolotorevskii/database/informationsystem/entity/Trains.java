package com.github.zolotorevskii.database.informationsystem.entity;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.StationsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Trains\"")
@Getter
@Setter
public class Trains extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"type_train\"", referencedColumnName = "\"id\"")
    private StatusTrains statusTrains;

    @Column(name = "\"places_in_railway_carriage\"", nullable = false)
    private Long placesInRailwayCarriage;

    @Column(name = "\"capacity_railway_carriage\"", nullable = false)
    private Long capacityRailwayCarriage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"brigade_train_drivers\"", referencedColumnName = "\"id\"")
    private Brigades brigadeTrainDrivers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"brigade_operability\"", referencedColumnName = "\"id\"")
    private Brigades brigadeOperability;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"brigade_preparation\"", referencedColumnName = "\"id\"")
    private Brigades brigadePreparation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"station\"", referencedColumnName = "\"id\"")
    private Stations stations;
}