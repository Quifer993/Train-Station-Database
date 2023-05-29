package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.ConnectionBrigadeWorkersDto;
import com.github.zolotorevskii.database.informationsystem.service.ConnectionBrigadeWorkersService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/brigadeWorker")
@AllArgsConstructor
public class ConnectionBrigadeWorkersController extends AbstractController<ConnectionBrigadeWorkersDto> {

    private final ConnectionBrigadeWorkersService connectionBrigadeWorkersService;

    @Override
    protected Service<ConnectionBrigadeWorkersDto> getService() {
        return connectionBrigadeWorkersService;
    }
}
