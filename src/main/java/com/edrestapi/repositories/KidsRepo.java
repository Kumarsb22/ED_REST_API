package com.edrestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edrestapi.entities.KidsEntity;

@Repository
public interface KidsRepo extends JpaRepository<KidsEntity, Integer>{

}
