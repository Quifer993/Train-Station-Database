package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StatusOperabilityDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StatusOperabilityService;
import com.github.zolotorevskii.database.informationsystem.service.StatusPreparationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/statusOperability")
@AllArgsConstructor
public class StatusOperabilityController extends AbstractController<StatusOperabilityDto> {

    private final StatusOperabilityService statusOperabilityService;

    @Override
    protected Service<StatusOperabilityDto> getService() {
        return statusOperabilityService;
    }
}
