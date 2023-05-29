package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.FlightDto;
import com.github.zolotorevskii.database.informationsystem.dto.StationsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Flight;
import com.github.zolotorevskii.database.informationsystem.entity.Stations;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FlightMapper extends IMapper<Flight, FlightDto> {
    @Override
    FlightDto toDto(Flight stations);

    @Override
    Flight toEntity(FlightDto stationsDto);
}
