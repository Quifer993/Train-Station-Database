package com.github.zolotorevskii.database.informationsystem.repository;

import com.github.zolotorevskii.database.informationsystem.entity.StatusPassengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusPassengersRepository extends JpaRepository<StatusPassengers, Long> {
}
