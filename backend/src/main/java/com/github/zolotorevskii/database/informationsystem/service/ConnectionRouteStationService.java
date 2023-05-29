package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.ConnectionBrigadeWorkersDto;
import com.github.zolotorevskii.database.informationsystem.dto.ConnectionRouteStationDto;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionBrigadeWorkers;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionRouteStation;
import com.github.zolotorevskii.database.informationsystem.mapper.ConnectionRouteStationMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.repository.ConnectionRouteStationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConnectionRouteStationService extends AbstractService<ConnectionRouteStation, ConnectionRouteStationDto> {

    private final ConnectionRouteStationRepository connectionRouteStationRepository;
    private final ConnectionRouteStationMapper connectionRouteStationMapper;

    @Override
    protected JpaRepository<ConnectionRouteStation, Long> getRepository() {
        return connectionRouteStationRepository;
    }

    @Override
    protected IMapper<ConnectionRouteStation, ConnectionRouteStationDto> getMapper() {
        return connectionRouteStationMapper;
    }
}
