package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.MedicalExaminationDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.entity.MedicalExamination;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.MedicalExaminationMapper;
import com.github.zolotorevskii.database.informationsystem.repository.MedicalExaminationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedicalExaminationService extends AbstractService<MedicalExamination, MedicalExaminationDto> {

    private final MedicalExaminationRepository medicalExaminationRepository;
    private final MedicalExaminationMapper medicalExaminationMapper;

    @Override
    protected JpaRepository<MedicalExamination, Long> getRepository() {
        return medicalExaminationRepository;
    }

    @Override
    protected IMapper<MedicalExamination, MedicalExaminationDto> getMapper() {
        return medicalExaminationMapper;
    }
}
