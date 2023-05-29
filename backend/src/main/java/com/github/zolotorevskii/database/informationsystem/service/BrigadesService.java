package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.BrigadesMapper;
import com.github.zolotorevskii.database.informationsystem.repository.BrigadesRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrigadesService extends AbstractService<Brigades, BrigadesDto> {

    private final BrigadesRepository brigadesRepository;
    private final BrigadesMapper brigadesMapper;

    @Override
    protected JpaRepository<Brigades, Long> getRepository() {
        return brigadesRepository;
    }

    @Override
    protected IMapper<Brigades, BrigadesDto> getMapper() {
        return brigadesMapper;
    }

//    public Page<BrigadesDto> getBrigades(Long departmentId, Pageable pageable) {
//        Page<Brigades> brigades = brigadesRepository.findAllByDepartmentNameId(departmentId, pageable);
//        return brigades.map(brigadesMapper::toDto);
//    }
}
