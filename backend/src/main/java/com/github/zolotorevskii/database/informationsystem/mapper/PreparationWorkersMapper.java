package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.PreparationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.entity.PreparationWorkers;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PreparationWorkersMapper extends IMapper<PreparationWorkers, PreparationWorkersDto> {
    @Override
    PreparationWorkersDto toDto(PreparationWorkers preparationWorkers);

    @Override
    PreparationWorkers toEntity(PreparationWorkersDto preparationWorkersDto);
}
