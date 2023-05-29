package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.StationWorkers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StationWorkersRepository extends JpaRepository<StationWorkers, Long> {
    @Query("""
            select ot.stationWorkers from StationWorkers st, Work w, ConnectionBrigadeWorkers ot, Brigades b, Trains t
            where 
            w.id = st.work.id and
            st.id = ot.stationWorkers.id and
            ot.brigades.id = b.id and
            b.id in(t.brigadePreparation.id, t.brigadeTrainDrivers.id, t.brigadeOperability.id) and
            (:departmentId is null or ot.brigades.department.id=:departmentId) and
            (:trainsId is null or t.id=:trainsId) and
            (:workId is null or w.id=:workId) and
            (:brigadesId is null or ot.brigades.id =:brigadesId) 
            """)
    Page<StationWorkers> searchFilter(
            Long departmentId,
            Long brigadesId,
            Long trainsId,
            Long workId,
            Pageable pageable);
}
