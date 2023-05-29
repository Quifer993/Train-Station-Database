package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.StationWorkers;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TrainDriversRepository extends JpaRepository<TrainDrivers, Long> {
    @Query("""
            select st from TrainDrivers st, MedicalExamination me
            where
            st.id = me.trainDrivers.id and
            (:resultId is null or me.result=:resultId) and
            (cast(:minDate as date) is null or me.dateMedicalExamination >= cast(:minDate as date)) and
            (cast(:maxDate as date) is null or me.dateMedicalExamination <= cast(:maxDate as date))
            """)
    Page<TrainDrivers> searchByFilter(
            String resultId,
            Date minDate,
            Date maxDate,
            Pageable pageable);
}
