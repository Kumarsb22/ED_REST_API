package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.EducationEntity;

@Repository
public interface EducattionRep extends JpaRepository<EducationEntity, Integer>{

}
