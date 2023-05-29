package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusPreparationDto;
import com.github.zolotorevskii.database.informationsystem.entity.Department;
import com.github.zolotorevskii.database.informationsystem.entity.StatusPreparation;
import com.github.zolotorevskii.database.informationsystem.mapper.DepartmentMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusPreparationMapper;
import com.github.zolotorevskii.database.informationsystem.repository.DepartmentRepository;
import com.github.zolotorevskii.database.informationsystem.repository.StatusPreparationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatusPreparationService extends AbstractService<StatusPreparation, StatusPreparationDto> {

    private final StatusPreparationRepository statusPreparationRepository;
    private final StatusPreparationMapper statusPreparationMapper;

    @Override
    protected JpaRepository<StatusPreparation, Long> getRepository() {
        return statusPreparationRepository;
    }

    @Override
    protected IMapper<StatusPreparation, StatusPreparationDto> getMapper() {
        return statusPreparationMapper;
    }
}
