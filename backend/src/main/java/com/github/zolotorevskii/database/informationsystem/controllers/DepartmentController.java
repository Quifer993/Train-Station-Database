package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.service.DepartmentService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/department")
@AllArgsConstructor
public class DepartmentController extends AbstractController<DepartmentDto> {

    private final DepartmentService departmentService;

    @Override
    protected Service<DepartmentDto> getService() {
        return departmentService;
    }
}
