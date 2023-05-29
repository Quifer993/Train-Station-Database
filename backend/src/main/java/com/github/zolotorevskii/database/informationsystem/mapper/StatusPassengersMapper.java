package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPassengersDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusFlights;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPassengers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusPassengersMapper extends IMapper<StatusPassengers, StatusPassengersDto> {
    @Override
    StatusPassengersDto toDto(StatusPassengers statusPassengers);

    @Override
    StatusPassengers toEntity(StatusPassengersDto statusPassengersDto);
}
