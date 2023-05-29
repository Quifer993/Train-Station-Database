package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Trains;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainsRepository extends JpaRepository<Trains, Long> {
    @Query("""
            select t from Trains t, Flight f, Routes r
            where
            t.id = f.trains.id and
            f.routes.id = r.id and
            (:routeId is null or r.id=:routeId)
            """)
    Page<Trains> searchByFilter(
            Long routeId,
            Pageable pageable);

    @Query("""
            select t from Trains t, Flight f, Routes r
            where
            t.id = f.trains.id and
            f.routes.id = r.id and
            (:routeId is null or r.id=:routeId) order by f.priceFlight
            """)
    Page<Trains> searchToFilter(
            Long routeId,
            Pageable pageable);
    @Query("""
            select t from Trains t, Flight f, Routes r
            where
            t.id = f.trains.id and
            f.routes.id = r.id and
            (:routeId is null or r.id=:routeId) order by f.priceFlight DESC
            """)
    Page<Trains> searchBackFilter(
            Long routeId,
            Pageable pageable);
}
