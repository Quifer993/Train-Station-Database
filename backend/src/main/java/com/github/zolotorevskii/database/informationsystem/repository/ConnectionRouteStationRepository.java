package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.ConnectionBrigadeWorkers;
import com.github.zolotorevskii.database.informationsystem.entity.ConnectionRouteStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRouteStationRepository extends JpaRepository<ConnectionRouteStation, Long> {
}
