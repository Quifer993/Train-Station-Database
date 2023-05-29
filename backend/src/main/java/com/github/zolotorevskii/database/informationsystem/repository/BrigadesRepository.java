package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrigadesRepository extends JpaRepository<Brigades, Long> {
//    Page<Brigades> findAllByDepartmentNameId(Long departmentNameId, Pageable pageable);
}
