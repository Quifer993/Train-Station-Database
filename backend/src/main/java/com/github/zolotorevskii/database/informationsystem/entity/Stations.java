package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Stations\"")
@Getter
@Setter
public class Stations extends AbstractEntity {

    @Column(name = "\"placement\"", nullable = false, unique = true, length=128)
    private String placement;
}