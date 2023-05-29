package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.MedicalExaminationDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.service.MedicalExaminationService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/medical")
@AllArgsConstructor
public class MedicalExaminationController extends AbstractController<MedicalExaminationDto> {

    private final MedicalExaminationService medicalExaminationService;

    @Override
    protected Service<MedicalExaminationDto> getService() {
        return medicalExaminationService;
    }
}
