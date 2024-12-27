package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.EdEntity;

@Repository
public interface EdRepositories extends JpaRepository<EdEntity, Integer> {

}
