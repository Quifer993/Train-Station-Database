package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.StatusTrains;
import com.github.zolotorevskii.database.informationsystem.entity.TrainComplexes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainComplexesRepository extends JpaRepository<TrainComplexes, Long> {
}
