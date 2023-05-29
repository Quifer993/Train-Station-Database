package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.WorkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/work")
@AllArgsConstructor
public class WorkController extends AbstractController<WorkDto> {

    private final WorkService workService;

    @Override
    protected Service<WorkDto> getService() {
        return workService;
    }
}
