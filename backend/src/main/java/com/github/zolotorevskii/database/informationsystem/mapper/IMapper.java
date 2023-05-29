package com.github.zolotorevskii.database.informationsystem.mapper;

import com.github.zolotorevskii.database.informationsystem.dto.AbstractDto;
import com.github.zolotorevskii.database.informationsystem.entity.AbstractEntity;

public interface IMapper<E extends AbstractEntity, DTO extends AbstractDto> {
    E toEntity(DTO dto);

    DTO toDto(E entity);
}
