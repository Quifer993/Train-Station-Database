package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainDriversMapper extends IMapper<TrainDrivers, TrainDriversDto> {
    @Override
    TrainDriversDto toDto(TrainDrivers trainDrivers);

    @Override
    TrainDrivers toEntity(TrainDriversDto trainDriversDto);
}
