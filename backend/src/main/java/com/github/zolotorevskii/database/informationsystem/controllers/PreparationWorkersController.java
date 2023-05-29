package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.PreparationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.service.PreparationWorkersService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/preparationWorkers")
@AllArgsConstructor
public class PreparationWorkersController extends AbstractController<PreparationWorkersDto> {

    private final PreparationWorkersService preparationWorkersService;

    @Override
    protected Service<PreparationWorkersDto> getService() {
        return preparationWorkersService;
    }
}
