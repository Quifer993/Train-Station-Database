package com.github.zolotorevskii.database.informationsystem.dto;

import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MedicalExaminationDto extends TrainDriversDto {
    private TrainDriversDto trainDrivers;
    LocalDate dateMedicalExamination;
    String result;
    String description;
}
