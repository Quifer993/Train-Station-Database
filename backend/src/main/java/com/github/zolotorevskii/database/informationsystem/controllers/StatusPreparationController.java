package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StatusPreparationService;
import com.github.zolotorevskii.database.informationsystem.service.StatusTrainsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/statusPreparation")
@AllArgsConstructor
public class StatusPreparationController extends AbstractController<StatusPreparationDto> {

    private final StatusPreparationService statusPreparationService;

    @Override
    protected Service<StatusPreparationDto> getService() {
        return statusPreparationService;
    }
}
