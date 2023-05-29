package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.ConnectionRouteStationDto;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionRouteStation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConnectionRouteStationMapper extends IMapper<ConnectionRouteStation, ConnectionRouteStationDto> {
    @Override
    ConnectionRouteStationDto toDto(ConnectionRouteStation connectionRouteStation);

    @Override
    ConnectionRouteStation toEntity(ConnectionRouteStationDto connectionRouteStationDto);
}
