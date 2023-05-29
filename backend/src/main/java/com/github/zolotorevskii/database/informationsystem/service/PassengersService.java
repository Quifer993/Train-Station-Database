package com.github.zolotorevskii.database.informationsystem.service;

import com.github.zolotorevskii.database.informationsystem.dto.BrigadesDto;
import com.github.zolotorevskii.database.informationsystem.dto.PassengersDto;
import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.entity.Passengers;
import com.github.zolotorevskii.database.informationsystem.mapper.BrigadesMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.IMapper;
import com.github.zolotorevskii.database.informationsystem.mapper.PassengersMapper;
import com.github.zolotorevskii.database.informationsystem.repository.BrigadesRepository;
import com.github.zolotorevskii.database.informationsystem.repository.PassengersRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PassengersService extends AbstractService<Passengers, PassengersDto> {

    private final PassengersRepository passengersRepository;
    private final PassengersMapper passengersMapper;

    @Override
    protected JpaRepository<Passengers, Long> getRepository() {
        return passengersRepository;
    }

    @Override
    protected IMapper<Passengers, PassengersDto> getMapper() {
        return passengersMapper;
    }

//    public Page<BrigadesDto> getBrigades(Long departmentId, Pageable pageable) {
//        Page<Brigades> brigades = brigadesRepository.findAllByDepartmentNameId(departmentId, pageable);
//        return brigades.map(brigadesMapper::toDto);
//    }
}
