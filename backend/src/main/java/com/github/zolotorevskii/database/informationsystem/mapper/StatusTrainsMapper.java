package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StatusOperabilityDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusOperability;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusTrainsMapper extends IMapper<StatusTrains, StatusTrainsDto> {
    @Override
    StatusTrainsDto toDto(StatusTrains department);

    @Override
    StatusTrains toEntity(StatusTrainsDto departmentDto);
}
