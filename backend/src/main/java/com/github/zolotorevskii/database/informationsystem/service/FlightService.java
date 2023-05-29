package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.FlightDto;
import com.github.zolotorevskii.database.informationsystem.dto.TrainsDto;
import com.github.zolotorevskii.database.informationsystem.entity.Flight;
import com.github.zolotorevskii.database.informationsystem.filter.FlightFilter;
import com.github.zolotorevskii.database.informationsystem.filter.TrainsFilter;
import com.github.zolotorevskii.database.informationsystem.filter.type.LuggageEnum;
import com.github.zolotorevskii.database.informationsystem.mapper.FlightMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlightService extends AbstractService<Flight, FlightDto> {

    private final FlightRepository flightRepository;
    private final FlightMapper flightMapper;

    @Override
    protected JpaRepository<Flight, Long> getRepository() {
        return flightRepository;
    }

    @Override
    protected IMapper<Flight, FlightDto> getMapper() {
        return flightMapper;
    }


    public Page<FlightDto> searchByFilter(FlightFilter filter, Pageable pageable) {
        Long routeId = filter.getRoutes() == null ? null : filter.getRoutes().getId();
        Long statusFlightId = filter.getStatusFlights() == null ? null : filter.getStatusFlights().getId();
        Long statusTrainsId = filter.getStatusTrains() == null ? null : filter.getStatusTrains().getId();

        if (routeId == null && statusFlightId == null && statusTrainsId == null) {
            return flightRepository.findAll(pageable).map(flightMapper::toDto);
        }

        return flightRepository.searchFilter(
                routeId,
                statusFlightId,
                statusTrainsId,
                pageable
        ).map(flightMapper::toDto);
    }
}
