package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StationsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Stations;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StationsMapper extends IMapper<Stations, StationsDto> {
    @Override
    StationsDto toDto(Stations stations);

    @Override
    Stations toEntity(StationsDto stationsDto);
}
