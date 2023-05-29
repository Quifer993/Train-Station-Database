package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"Connection_route_station\"")
public class ConnectionRouteStation extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_route\"", referencedColumnName = "\"id\"")
    private Routes routes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_station\"", referencedColumnName = "\"id\"")
    private Stations stations;

    @Column(name = "\"number_station_from_start\"", nullable = false)
    private Integer numberStationFromStart;

    @Column(name = "\"time_to_next_station\"", nullable = false)
    private Integer timeToNextStation;

    @Column(name = "\"time_wait\"", nullable = false)
    private Integer timeWait;
}