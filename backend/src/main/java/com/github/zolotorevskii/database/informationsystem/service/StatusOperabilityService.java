package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.dto.StatusOperabilityDto;
import com.github.zolotorevskii.database.informationsystem.entity.Department;
import com.github.zolotorevskii.database.informationsystem.entity.StatusOperability;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusOperabilityMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.StatusPreparationMapper;
import com.github.zolotorevskii.database.informationsystem.repository.StatusOperabilityRepository;
import com.github.zolotorevskii.database.informationsystem.repository.StatusPreparationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatusOperabilityService extends AbstractService<StatusOperability, StatusOperabilityDto> {

    private final StatusOperabilityRepository statusOperabilityRepository;
    private final StatusOperabilityMapper statusOperabilityMapper;

    @Override
    protected JpaRepository<StatusOperability, Long> getRepository() {
        return statusOperabilityRepository;
    }

    @Override
    protected IMapper<StatusOperability, StatusOperabilityDto> getMapper() {
        return statusOperabilityMapper;
    }
}
