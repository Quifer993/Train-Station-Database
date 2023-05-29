package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.StationWorkersDto;
import com.github.zolotorevskii.database.informationsystem.entity.StationWorkers;
import com.github.zolotorevskii.database.informationsystem.filter.StationWorkersFilter;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StationWorkersMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StationWorkersRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StationWorkersService extends AbstractService<StationWorkers, StationWorkersDto> {

    private final StationWorkersRepository stationWorkersRepository;
    private final StationWorkersMapper stationWorkersMapper;

    @Override
    protected JpaRepository<StationWorkers, Long> getRepository() {
        return stationWorkersRepository;
    }

    @Override
    protected IMapper<StationWorkers, StationWorkersDto> getMapper() {
        return stationWorkersMapper;
    }


    public Page<StationWorkersDto> searchByFilter(StationWorkersFilter filter, Pageable pageable) {
        Long departmentId = filter.getDepartment() == null ? null : filter.getDepartment().getId();
        Long brigadesId = filter.getBrigades() == null ? null : filter.getBrigades().getId();
        Long trainsId = filter.getTrains() == null ? null : filter.getTrains().getId();
        Long workId = filter.getWork() == null ? null : filter.getWork().getId();

        if (departmentId == null && brigadesId == null && trainsId == null && workId == null) {
            return stationWorkersRepository.findAll(pageable).map(stationWorkersMapper::toDto);
        }

        return stationWorkersRepository.searchFilter(
                departmentId,
                brigadesId,
                trainsId,
                workId,
                pageable
        ).map(stationWorkersMapper::toDto);


    }
}