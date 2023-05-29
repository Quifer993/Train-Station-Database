package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.RoutesDto;
import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.entity.Routes;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoutesMapper extends IMapper<Routes, RoutesDto> {
    @Override
    RoutesDto toDto(Routes routes);

    @Override
    Routes toEntity(RoutesDto routesDto);
}
