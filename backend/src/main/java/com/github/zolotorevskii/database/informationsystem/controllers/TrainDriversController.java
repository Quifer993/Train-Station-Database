package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.filter.StationWorkersFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainDriversFilter;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.TrainDriversService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/trainDrivers")
@AllArgsConstructor
public class TrainDriversController extends AbstractController<TrainDriversDto> {

    private final TrainDriversService trainDriversService;

    @Override
    protected Service<TrainDriversDto> getService() {
        return trainDriversService;
    }

    @PostMapping("/search")
    public ResponseEntity<Page<TrainDriversDto>> search(@RequestBody TrainDriversFilter filter, Pageable pageable) {
        return ResponseEntity.ok(trainDriversService.searchByFilter(filter, pageable));
    }
}
