package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.Brigades;
import com.github.zolotorevskii.database.informationsystem.entity.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengersRepository extends JpaRepository<Passengers, Long> {

}
