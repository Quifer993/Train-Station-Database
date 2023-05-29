package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Routes\"")
@Getter
@Setter
public class Routes extends AbstractEntity {

    @Column(name = "\"name_route\"", nullable = false, unique = true, length=128)
    private String nameRoute;
}