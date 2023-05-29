package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StatusPassengersDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPassengers;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPreparation;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusPassengersMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusPreparationMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StatusPassengersRepository;
import com.github.zolotorevskii.database.informationsystem.repository.StatusPreparationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatusPassengersService extends AbstractService<StatusPassengers, StatusPassengersDto> {

    private final StatusPassengersRepository statusPassengersRepository;
    private final StatusPassengersMapper statusPassengersMapper;

    @Override
    protected JpaRepository<StatusPassengers, Long> getRepository() {
        return statusPassengersRepository;
    }

    @Override
    protected IMapper<StatusPassengers, StatusPassengersDto> getMapper() {
        return statusPassengersMapper;
    }
}
