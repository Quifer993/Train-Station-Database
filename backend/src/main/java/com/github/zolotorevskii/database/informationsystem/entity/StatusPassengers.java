package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Status_passengers\"")
@Getter
@Setter
public class StatusPassengers extends AbstractEntity {

    @Column(name = "\"name_status\"", nullable = false, unique = true, length=128)
    private String nameStatus;

    @Column(name = "\"discount\"", nullable = false)
    private Long discount;
}