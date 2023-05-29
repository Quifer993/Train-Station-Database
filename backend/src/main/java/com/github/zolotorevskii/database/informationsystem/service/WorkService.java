package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.WorkDto;
import com.github.zolotorevskii.database.informationsystem.entity.Work;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.WorkMapper;
import com.github.zolotorevskii.database.informationsystem.repository.WorkRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WorkService extends AbstractService<Work, WorkDto> {

    private final WorkRepository workRepository;
    private final WorkMapper workMapper;

    @Override
    protected JpaRepository<Work, Long> getRepository() {
        return workRepository;
    }

    @Override
    protected IMapper<Work, WorkDto> getMapper() {
        return workMapper;
    }
}
