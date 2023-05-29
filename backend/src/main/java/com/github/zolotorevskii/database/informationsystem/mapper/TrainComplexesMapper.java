package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainComplexesDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import com.github.zolotorevskii.database.informationsystem.entity.TrainComplexes;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainComplexesMapper extends IMapper<TrainComplexes, TrainComplexesDto> {
    @Override
    TrainComplexesDto toDto(TrainComplexes department);

    @Override
    TrainComplexes toEntity(TrainComplexesDto departmentDto);
}
