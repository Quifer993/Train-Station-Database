package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "\"Passengers\"")
public class Passengers extends AbstractEntity {
    @Column(name = "\"sex\"", length = 1, nullable = false, columnDefinition = "VARCHAR2(1) DEFAULT 'M'")
    private String sex;

    @Column(name = "\"birthday\"", nullable = false)
    private LocalDate birthday;

    @Column(name = "\"first_name\"", nullable = false, length = 128)
    private String firstName;

    @Column(name = "\"last_name\"", nullable = false, length = 128)
    private String lastName;

    @Column(name = "\"surname\"", nullable = false, length = 128)
    private String surname;
}