package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Departments\"")
@Getter
@Setter
public class Department extends AbstractEntity {

    @Column(name = "\"name_department\"", nullable = false, unique = true, length=128)
    private String departmentName;
}