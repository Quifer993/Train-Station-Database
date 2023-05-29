package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Brigades\"")
@Getter
@Setter
public class Brigades extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_department\"", referencedColumnName = "\"id\"")
    private Department department;

}