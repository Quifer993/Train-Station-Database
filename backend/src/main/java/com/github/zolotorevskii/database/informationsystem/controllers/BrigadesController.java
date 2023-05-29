package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.service.BrigadesService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/brigades")
@AllArgsConstructor
public class BrigadesController extends AbstractController<BrigadesDto> {

    private final BrigadesService brigadesService;

    @Override
    protected Service<BrigadesDto> getService() {
        return brigadesService;
    }

//    @GetMapping("/{departmentId}")
//    public Page<BrigadesDto> getBrigades(@PathVariable("departmentId") Long departmentId, Pageable pageable) {
//        return brigadesService.getBrigades(departmentId, pageable);
//    }
}
