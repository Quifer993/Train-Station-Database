package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.FlightDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.filter.FlightFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainsFilter;
import com.github.zolotorevskii.database.informationsystem.service.FlightService;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/flight")
@AllArgsConstructor
public class FlightController extends AbstractController<FlightDto> {

    private final FlightService flightService;

    @Override
    protected Service<FlightDto> getService() {
        return flightService;
    }

    @PostMapping("/search")
    public ResponseEntity<Page<FlightDto>> search(@RequestBody FlightFilter filter, Pageable pageable) {
        return ResponseEntity.ok(flightService.searchByFilter(filter, pageable));
    }
}
