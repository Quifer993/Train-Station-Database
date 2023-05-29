package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"Connection_brigade_workers\"")
public class ConnectionBrigadeWorkers extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"brigade\"", referencedColumnName = "\"id\"")
    private Brigades brigades;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_worker\"", referencedColumnName = "\"id\"")
    private StationWorkers stationWorkers;
}