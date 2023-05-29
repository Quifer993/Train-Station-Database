package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Tickets;
import com.github.zolotorevskii.database.informationsystem.entity.Trains;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
    @Query("""
            select t from Tickets t, Flight f, Routes r
            where
            t.flight.id = f.id and
            f.routes.id = r.id and
            (:flightId is null or t.flight.id=:flightId)
            """)
    Page<Tickets> searchFilter(
            Long flightId,
            Pageable pageable);

}
