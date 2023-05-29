package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StationsDto;
import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.entity.Stations;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StationsMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.WorkMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StationsRepository;
import com.github.zolotorevskii.database.informationsystem.repository.WorkRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StationsService extends AbstractService<Stations, StationsDto> {

    private final StationsRepository stationsRepository;
    private final StationsMapper stationsMapper;

    @Override
    protected JpaRepository<Stations, Long> getRepository() {
        return stationsRepository;
    }

    @Override
    protected IMapper<Stations, StationsDto> getMapper() {
        return stationsMapper;
    }
}
