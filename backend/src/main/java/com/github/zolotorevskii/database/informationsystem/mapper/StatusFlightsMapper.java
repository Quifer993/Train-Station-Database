package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusFlights;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusFlightsMapper extends IMapper<StatusFlights, StatusFlightsDto> {
    @Override
    StatusFlightsDto toDto(StatusFlights department);

    @Override
    StatusFlights toEntity(StatusFlightsDto departmentDto);
}
