package com.github.zolotorevskii.database.informationsystem.controllers;

import com.github.zolotorevskii.database.informationsystem.dto.TicketsDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.filter.TicketsFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainDriversFilter;
import com.github.zolotorevskii.database.informationsystem.service.Service;
import com.github.zolotorevskii.database.informationsystem.service.TicketsService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tickets")
@AllArgsConstructor
public class TicketsController extends AbstractController<TicketsDto> {

    private final TicketsService ticketsService;

    @Override
    protected Service<TicketsDto> getService() {
        return ticketsService;
    }

    @PostMapping("/search")
    public ResponseEntity<Page<TicketsDto>> search(@RequestBody TicketsFilter filter, Pageable pageable) {
        return ResponseEntity.ok(ticketsService.searchFilter(filter, pageable));
    }
}
