package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.PlanSelectionEntity;

@Repository
public interface PlanSelectionRepo extends JpaRepository<PlanSelectionEntity, Integer>{

}
