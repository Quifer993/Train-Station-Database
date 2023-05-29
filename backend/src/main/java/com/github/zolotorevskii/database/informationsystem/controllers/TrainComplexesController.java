package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.TrainComplexesDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.TrainComplexesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/trainComplexes")
@AllArgsConstructor
public class TrainComplexesController extends AbstractController<TrainComplexesDto> {

    private final TrainComplexesService trainComplexesService;

    @Override
    protected Service<TrainComplexesDto> getService() {
        return trainComplexesService;
    }
}
