package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.StatusOperabilityDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusOperability;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPreparation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusOperabilityMapper extends IMapper<StatusOperability, StatusOperabilityDto> {
    @Override
    StatusOperabilityDto toDto(StatusOperability department);

    @Override
    StatusOperability toEntity(StatusOperabilityDto departmentDto);
}
