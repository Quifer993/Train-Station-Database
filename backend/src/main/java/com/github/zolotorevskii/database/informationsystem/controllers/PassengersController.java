package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.PassengersDto;
import com.github.zolotorevskii.database.informationsystem.service.BrigadesService;
import com.github.zolotorevskii.database.informationsystem.service.PassengersService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/passengers")
@AllArgsConstructor
public class PassengersController extends AbstractController<PassengersDto> {

    private final PassengersService passengersService;

    @Override
    protected Service<PassengersDto> getService() {
        return passengersService;
    }
}
