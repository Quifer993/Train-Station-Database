package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WorkMapper extends IMapper<Work, WorkDto> {
    @Override
    WorkDto toDto(Work department);

    @Override
    Work toEntity(WorkDto departmentDto);
}
