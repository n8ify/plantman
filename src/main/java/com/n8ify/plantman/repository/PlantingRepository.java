package com.n8ify.plantman.repository;

import com.n8ify.plantman.model.entity.PlantingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantingRepository extends JpaRepository<PlantingEntity, Long> {


}
