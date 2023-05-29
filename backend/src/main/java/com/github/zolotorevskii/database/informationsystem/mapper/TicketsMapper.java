package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.TicketsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.entity.Tickets;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TicketsMapper extends IMapper<Tickets, TicketsDto> {
    @Override
    TicketsDto toDto(Tickets tickets);

    @Override
    Tickets toEntity(TicketsDto ticketsDto);
}
