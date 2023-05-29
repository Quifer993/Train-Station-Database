package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StatusTrainsDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainComplexesDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import com.github.zolotorevskii.database.informationsystem.entity.TrainComplexes;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.TrainComplexesMapper;
import com.github.zolotorevskii.database.informationsystem.repository.TrainComplexesRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TrainComplexesService extends AbstractService<TrainComplexes, TrainComplexesDto> {

    private final TrainComplexesRepository trainComplexesRepository;
    private final TrainComplexesMapper trainComplexesMapper;

    @Override
    protected JpaRepository<TrainComplexes, Long> getRepository() {
        return trainComplexesRepository;
    }

    @Override
    protected IMapper<TrainComplexes, TrainComplexesDto> getMapper() {
        return trainComplexesMapper;
    }
}
