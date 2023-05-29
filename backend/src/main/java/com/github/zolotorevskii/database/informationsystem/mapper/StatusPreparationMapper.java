package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.entity.Department;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPreparation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusPreparationMapper extends IMapper<StatusPreparation, StatusPreparationDto> {
    @Override
    StatusPreparationDto toDto(StatusPreparation department);

    @Override
    StatusPreparation toEntity(StatusPreparationDto departmentDto);
}
