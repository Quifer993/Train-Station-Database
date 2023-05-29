package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.StationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.filter.StationWorkersFilter;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.StationWorkersService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employee")
@AllArgsConstructor
public class StationWorkersController extends AbstractController<StationWorkersDto> {

    private final StationWorkersService stationWorkersService;

    @Override
    protected Service<StationWorkersDto> getService() {
        return stationWorkersService;
    }

    @PostMapping("/search")
    public ResponseEntity<Page<StationWorkersDto>> search(@RequestBody StationWorkersFilter filter, Pageable pageable) {
        return ResponseEntity.ok(stationWorkersService.searchByFilter(filter, pageable));
    }
}
