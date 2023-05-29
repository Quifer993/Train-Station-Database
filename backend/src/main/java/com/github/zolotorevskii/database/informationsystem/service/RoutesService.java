package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.RoutesDto;
import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.entity.Routes;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.RoutesMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.WorkMapper;
import com.github.zolotorevskii.database.informationsystem.repository.RoutesRepository;
import com.github.zolotorevskii.database.informationsystem.repository.WorkRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoutesService extends AbstractService<Routes, RoutesDto> {

    private final RoutesRepository routesRepository;
    private final RoutesMapper routesMapper;

    @Override
    protected JpaRepository<Routes, Long> getRepository() {
        return routesRepository;
    }

    @Override
    protected IMapper<Routes, RoutesDto> getMapper() {
        return routesMapper;
    }
}
