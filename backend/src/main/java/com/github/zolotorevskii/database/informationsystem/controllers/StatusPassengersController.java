package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StatusOperabilityDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPassengersDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StatusOperabilityService;
import com.github.zolotorevskii.database.informationsystem.service.StatusPassengersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/statusPassengers")
@AllArgsConstructor
public class StatusPassengersController extends AbstractController<StatusPassengersDto> {

    private final StatusPassengersService statusPassengersService;

    @Override
    protected Service<StatusPassengersDto> getService() {
        return statusPassengersService;
    }
}
