package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.PlansEntity;

@Repository
public interface PlansRepo extends JpaRepository<PlansEntity, Integer>{

}
