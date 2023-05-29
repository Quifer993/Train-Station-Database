package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusTrainsMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StatusTrainsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TrainСomplexesService extends AbstractService<StatusTrains, StatusTrainsDto> {

    private final StatusTrainsRepository statusTrainsRepository;
    private final StatusTrainsMapper statusTrainsMapper;

    @Override
    protected JpaRepository<StatusTrains, Long> getRepository() {
        return statusTrainsRepository;
    }

    @Override
    protected IMapper<StatusTrains, StatusTrainsDto> getMapper() {
        return statusTrainsMapper;
    }
}
