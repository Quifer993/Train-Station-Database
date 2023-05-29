package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.DepartmentDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.entity.Department;
import com.github.zolotorevskii.database.informationsystem.mapper.DepartmentMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService extends AbstractService<Department, DepartmentDto> {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;


    @Override
    protected JpaRepository<Department, Long> getRepository() {
        return departmentRepository;
    }

    @Override
    protected IMapper<Department, DepartmentDto> getMapper() {
        return departmentMapper;
    }

//    public Page<BrigadesDto> getDepartment(Long departmentId, Pageable pageable) {
//        Page<Brigades> brigades = departmentRepository.findAllByDepartmentNameId(departmentId, pageable);
//        return brigades.map(departmentMapper::toDto);
//    }

}
