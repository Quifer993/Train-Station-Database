package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrigadesMapper extends IMapper<Brigades, BrigadesDto> {
    @Override
    BrigadesDto toDto(Brigades department);

    @Override
    Brigades toEntity(BrigadesDto departmentDto);
}
