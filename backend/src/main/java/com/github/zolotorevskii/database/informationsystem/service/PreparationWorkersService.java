package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.PreparationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.entity.PreparationWorkers;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.PreparationWorkersMapper;
import com.github.zolotorevskii.database.informationsystem.repository.PreparationWorkersRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PreparationWorkersService extends AbstractService<PreparationWorkers, PreparationWorkersDto> {

    private final PreparationWorkersRepository preparationWorkersRepository;
    private final PreparationWorkersMapper preparationWorkersMapper;

    @Override
    protected JpaRepository<PreparationWorkers, Long> getRepository() {
        return preparationWorkersRepository;
    }

    @Override
    protected IMapper<PreparationWorkers, PreparationWorkersDto> getMapper() {
        return preparationWorkersMapper;
    }
}
