package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StatusFlightsDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusFlights;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusFlightsMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusTrainsMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StatusFlightsRepository;
import com.github.zolotorevskii.database.informationsystem.repository.StatusTrainsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatusFlightsService extends AbstractService<StatusFlights, StatusFlightsDto> {

    private final StatusFlightsRepository statusFlightsRepository;
    private final StatusFlightsMapper statusFlightsMapper;

    @Override
    protected JpaRepository<StatusFlights, Long> getRepository() {
        return statusFlightsRepository;
    }

    @Override
    protected IMapper<StatusFlights, StatusFlightsDto> getMapper() {
        return statusFlightsMapper;
    }
}
