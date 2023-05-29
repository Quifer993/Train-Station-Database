package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.RoutesDto;
import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.service.RoutesService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.WorkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/routes")
@AllArgsConstructor
public class RoutesController extends AbstractController<RoutesDto> {

    private final RoutesService routesService;

    @Override
    protected Service<RoutesDto> getService() {
        return routesService;
    }
}
