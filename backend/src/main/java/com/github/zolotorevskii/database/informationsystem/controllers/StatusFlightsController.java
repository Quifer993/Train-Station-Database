package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusFlightsMapper;
import com.github.zolotorevskii.database.informationsystem.service.DepartmentService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StatusFlightsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/statusFlights")
@AllArgsConstructor
public class StatusFlightsController extends AbstractController<StatusFlightsDto> {

    private final StatusFlightsService statusFlightsService;

    @Override
    protected Service<StatusFlightsDto> getService() {
        return statusFlightsService;
    }
}
