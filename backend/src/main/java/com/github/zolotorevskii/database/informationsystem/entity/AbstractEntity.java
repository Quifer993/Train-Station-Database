package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractEntity implements Serializable {
    @Id
    @SequenceGenerator(name = "pet_seq", sequenceName = "pet_sequence",
            initialValue = 1, allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_seq")
    @Column(name = "\"id\"")
    private Long id;
}
