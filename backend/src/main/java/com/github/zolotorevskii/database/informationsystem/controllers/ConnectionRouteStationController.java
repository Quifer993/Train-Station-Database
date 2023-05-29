package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.ConnectionRouteStationDto;
import com.github.zolotorevskii.database.informationsystem.service.ConnectionRouteStationService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/routeStation")
@AllArgsConstructor
public class ConnectionRouteStationController extends AbstractController<ConnectionRouteStationDto> {

    private final ConnectionRouteStationService connectionRouteStationService;

    @Override
    protected Service<ConnectionRouteStationDto> getService() {
        return connectionRouteStationService;
    }
}
