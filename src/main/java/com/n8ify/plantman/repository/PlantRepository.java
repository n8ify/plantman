package com.n8ify.plantman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.n8ify.plantman.model.entity.*;

@Repository
public interface PlantRepository extends JpaRepository<PlantEntity, Long> {



}
