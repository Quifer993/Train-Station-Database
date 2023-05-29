package com.github.zolotorevskii.database.informationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import oracle.sql.DATE;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "\"Station_workers\"")
//@SecondaryTable(name = "\"Preparation_workerss\"",
//        pkJoinColumns = @PrimaryKeyJoinColumn(name = "\"id\"",
//                referencedColumnName = "\"id\""))
public class StationWorkers extends AbstractEntity {

    @Column(name = "\"sex\"", length = 1, nullable = false, columnDefinition = "VARCHAR2(1) DEFAULT 'M'")
    private String sex;

    @Column(name = "\"amount_children\"", nullable = false, columnDefinition = "NUMBER(2,0) DEFAULT 0")
    private Long amountChildren;

    @Column(name = "\"birthday\"", nullable = false)
    private LocalDate birthday;

    @Column(name = "\"salary\"", nullable = false)
    private Long salary;

    @Column(name = "\"first_name\"", nullable = false, length = 128)
    private String firstName;

    @Column(name = "\"last_name\"", nullable = false, length = 128)
    private String lastName;

    @Column(name = "\"surname\"", nullable = false, length = 128)
    private String surname;

    @Column(name = "\"hire_date\"", nullable = false)
    private LocalDate hireDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"ID_work\"", referencedColumnName = "\"id\"")
    private Work work;
}