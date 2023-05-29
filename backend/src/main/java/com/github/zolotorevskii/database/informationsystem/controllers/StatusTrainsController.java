package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StatusFlightsService;
import com.github.zolotorevskii.database.informationsystem.service.StatusTrainsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/statusTrains")
@AllArgsConstructor
public class StatusTrainsController extends AbstractController<StatusTrainsDto> {

    private final StatusTrainsService statusTrainsService;

    @Override
    protected Service<StatusTrainsDto> getService() {
        return statusTrainsService;
    }
}
