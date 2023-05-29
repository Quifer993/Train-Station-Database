package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.MedicalExaminationDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.entity.MedicalExamination;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MedicalExaminationMapper extends IMapper<MedicalExamination, MedicalExaminationDto> {
    @Override
    MedicalExaminationDto toDto(MedicalExamination medicalExamination);

    @Override
    MedicalExamination toEntity(MedicalExaminationDto medicalExaminationDto);
}
