package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.ConnectionBrigadeWorkersDto;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionBrigadeWorkers;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConnectionBrigadeWorkersMapper extends IMapper<ConnectionBrigadeWorkers, ConnectionBrigadeWorkersDto> {
    @Override
    ConnectionBrigadeWorkersDto toDto(ConnectionBrigadeWorkers connectionBrigadeWorkers);

    @Override
    ConnectionBrigadeWorkers toEntity(ConnectionBrigadeWorkersDto connectionBrigadeWorkersDto);
}
