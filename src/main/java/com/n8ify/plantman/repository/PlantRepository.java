package com.n8ify.plantman.repository;

import com.n8ify.plantman.model.entity.PlantDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<PlantDataEntity, Long> {



}
