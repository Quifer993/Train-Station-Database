package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.MedicalExamination;
import com.github.zolotorevskii.database.informationsystem.entity.TrainDrivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalExaminationRepository extends JpaRepository<MedicalExamination, Long> {
}
