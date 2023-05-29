package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.ConnectionBrigadeWorkersDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionBrigadeWorkers;
import com.github.zolotorevskii.database.informationsystem.mapper.BrigadesMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.ConnectionBrigadeWorkersMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.repository.BrigadesRepository;
import com.github.zolotorevskii.database.informationsystem.repository.ConnectionBrigadeWorkersRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConnectionBrigadeWorkersService extends AbstractService<ConnectionBrigadeWorkers, ConnectionBrigadeWorkersDto> {

    private final ConnectionBrigadeWorkersRepository connectionBrigadeWorkersRepository;
    private final ConnectionBrigadeWorkersMapper connectionBrigadeWorkersMapper;

    @Override
    protected JpaRepository<ConnectionBrigadeWorkers, Long> getRepository() {
        return connectionBrigadeWorkersRepository;
    }

    @Override
    protected IMapper<ConnectionBrigadeWorkers, ConnectionBrigadeWorkersDto> getMapper() {
        return connectionBrigadeWorkersMapper;
    }
}
