package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StationsDto;
import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StationsService;
import com.github.zolotorevskii.database.informationsystem.service.WorkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stations")
@AllArgsConstructor
public class StationsController extends AbstractController<StationsDto> {

    private final StationsService stationsService;

    @Override
    protected Service<StationsDto> getService() {
        return stationsService;
    }
}
