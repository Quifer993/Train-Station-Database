package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
}
