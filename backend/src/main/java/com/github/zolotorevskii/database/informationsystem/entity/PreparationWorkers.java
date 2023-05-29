package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"Preparation_workers\"")
@PrimaryKeyJoinColumn(name = "\"id\"")
public class PreparationWorkers extends StationWorkers {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"in_charge_complex\"", referencedColumnName = "\"id\"", nullable = true)
    TrainComplexes trainComplexes;
}