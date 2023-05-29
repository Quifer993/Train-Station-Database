package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Work\"")
@Getter
@Setter
public class Work extends AbstractEntity {

    @Column(name = "\"name_work\"", nullable = false, unique = true, length=128)
    private String workName;
}