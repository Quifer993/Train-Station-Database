package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.ConnectionBrigadeWorkers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionBrigadeWorkersRepository extends JpaRepository<ConnectionBrigadeWorkers, Long> {
}
