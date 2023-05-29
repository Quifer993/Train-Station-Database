package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.TrainDriversDto;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import com.github.zolotorevskii.database.informationsystem.filter.TrainDriversFilter;
import com.github.zolotorevskii.database.informationsystem.filter.type.ResultEnum;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.TrainDriversMapper;
import com.github.zolotorevskii.database.informationsystem.repository.TrainDriversRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class TrainDriversService extends AbstractService<TrainDrivers, TrainDriversDto> {

    private final TrainDriversRepository trainDriversRepository;
    private final TrainDriversMapper trainDriversMapper;

    @Override
    protected JpaRepository<TrainDrivers, Long> getRepository() {
        return trainDriversRepository;
    }

    @Override
    protected IMapper<TrainDrivers, TrainDriversDto> getMapper() {
        return trainDriversMapper;
    }


    public Page<TrainDriversDto> searchByFilter(TrainDriversFilter filter, Pageable pageable) {
        ResultEnum resultId = filter.getResultEnum() == null ? null : filter.getResultEnum();
        Date minDate = filter.getMinDate() == null ? null : filter.getMinDate();
        Date maxDate = filter.getMaxDate() == null ? null : filter.getMaxDate();
        if (resultId == null && minDate == null) {
            return trainDriversRepository.findAll(pageable).map(trainDriversMapper::toDto);
        }
        String result = null;
        if (resultId != null) {
            result = resultId == ResultEnum.OK ? "R" : "N";
        }

        return trainDriversRepository.searchByFilter(
                result,
                minDate,
                maxDate,
                pageable
        ).map(trainDriversMapper::toDto);


    }
}
