package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "\"Train_drivers\"")
@PrimaryKeyJoinColumn(name = "\"id\"")
public class TrainDrivers extends StationWorkers {
}