package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Train_complexes\"")
@Getter
@Setter
public class TrainComplexes extends AbstractEntity {

    @Column(name = "\"name_complex\"", nullable = false, unique = true, length=256)
    private String nameComplexes;
}