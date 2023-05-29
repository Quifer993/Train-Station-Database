package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Trains;
import com.github.zolotorevskii.database.informationsystem.filter.TrainsFilter;
import com.github.zolotorevskii.database.informationsystem.filter.type.LuggageEnum;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.TrainsMapper;
import com.github.zolotorevskii.database.informationsystem.repository.TrainsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TrainsService extends AbstractService<Trains, TrainsDto> {

    private final TrainsRepository trainsRepository;
    private final TrainsMapper trainsMapper;

    @Override
    protected JpaRepository<Trains, Long> getRepository() {
        return trainsRepository;
    }

    @Override
    protected IMapper<Trains, TrainsDto> getMapper() {
        return trainsMapper;
    }

    public Page<TrainsDto> searchByFilter(TrainsFilter filter, Pageable pageable) {
        Long routeId = filter.getRoutes() == null ? null : filter.getRoutes().getId();
        LuggageEnum luggageEnum = filter.getLuggageEnum() == null ? null : filter.getLuggageEnum();
        boolean isOrder = true;
        if (routeId == null && luggageEnum == null) {
            return trainsRepository.findAll(pageable).map(trainsMapper::toDto);
        }

        if(luggageEnum == null){
            return trainsRepository.searchByFilter(
                    routeId,
                    pageable
            ).map(trainsMapper::toDto);
        }
        else if(luggageEnum.equals(LuggageEnum.HAVE)){
            return trainsRepository.searchToFilter(
                    routeId,
                    pageable
            ).map(trainsMapper::toDto);
        }
        else{
            return trainsRepository.searchBackFilter(
                    routeId,
                    pageable
            ).map(trainsMapper::toDto);
        }
    }
}
