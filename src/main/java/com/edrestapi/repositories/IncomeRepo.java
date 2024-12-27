package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.IncomeEntity;

@Repository
public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer>{

}
