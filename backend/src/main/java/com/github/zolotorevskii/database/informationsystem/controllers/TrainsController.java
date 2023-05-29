package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.filter.TrainDriversFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainsFilter;
import com.github.zolotorevskii.database.informationsystem.service.BrigadesService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.TrainsService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/trains")
@AllArgsConstructor
public class TrainsController extends AbstractController<TrainsDto> {

    private final TrainsService trainsService;

    @Override
    protected Service<TrainsDto> getService() {
        return trainsService;
    }

    @PostMapping("/search")
    public ResponseEntity<Page<TrainsDto>> search(@RequestBody TrainsFilter filter, Pageable pageable) {
        return ResponseEntity.ok(trainsService.searchByFilter(filter, pageable));
    }
}
