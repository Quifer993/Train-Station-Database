package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Flight;
import com.github.zolotorevskii.database.informationsystem.entity.Trains;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("""
            select f from Flight f, Trains t, Routes r
            where
            t.id = f.trains.id and
            f.routes.id = r.id and
            (:routeId is null or r.id=:routeId) and
            (:statusFlightId is null or f.statusFlights.id=:statusFlightId) and
            (:statusTrainsId is null or t.statusTrains.id=:statusTrainsId)
            """)
    Page<Flight> searchFilter(
            Long routeId,
            Long statusFlightId,
            Long statusTrainsId,
            Pageable pageable);
}
