package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Stations;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationsRepository extends JpaRepository<Stations, Long> {
}
