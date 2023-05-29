package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.TicketsDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Tickets;
import com.github.zolotorevskii.database.informationsystem.filter.TicketsFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainsFilter;
import com.github.zolotorevskii.database.informationsystem.filter.type.LuggageEnum;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.TicketsMapper;
import com.github.zolotorevskii.database.informationsystem.repository.TicketsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketsService extends AbstractService<Tickets, TicketsDto> {

    private final TicketsRepository ticketsRepository;
    private final TicketsMapper ticketsMapper;

    @Override
    protected JpaRepository<Tickets, Long> getRepository() {
        return ticketsRepository;
    }

    @Override
    protected IMapper<Tickets, TicketsDto> getMapper() {
        return ticketsMapper;
    }

    public Page<TicketsDto> searchFilter(TicketsFilter filter, Pageable pageable) {
        Long flightId = filter.getFlight() == null ? null : filter.getFlight().getId();

        if (flightId == null) {
            return ticketsRepository.findAll(pageable).map(ticketsMapper::toDto);
        }


        return ticketsRepository.searchFilter(
                flightId,
                pageable
        ).map(ticketsMapper::toDto);

    }

}
