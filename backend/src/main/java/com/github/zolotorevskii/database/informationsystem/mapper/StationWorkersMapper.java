package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.entity.StationWorkers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StationWorkersMapper extends IMapper<StationWorkers, StationWorkersDto> {
    @Override
    StationWorkersDto toDto(StationWorkers department);

    @Override
    StationWorkers toEntity(StationWorkersDto departmentDto);
}
