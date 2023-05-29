package com.github.zolotorevskii.database.informationsystem.entity;

import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "\"Medical_examination\"")
public class MedicalExamination extends AbstractEntity {
    @Column(name = "\"date_medical_examination\"", nullable = false/*, columnDefinition = "DATE() DEFAULT NOW()"*/)
    LocalDate dateMedicalExamination;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"id_worker\"", referencedColumnName = "\"id\"")
    private TrainDrivers trainDrivers;

    @Column(name = "\"result\"", nullable = false, length=1, columnDefinition = "VARCHAR2(1) DEFAULT 'R'")
    String result;

    @Column(name = "\"description\"", nullable = true)
    String description;
}