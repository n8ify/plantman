package com.n8ify.plantman.service.impl;

import com.n8ify.plantman.repository.PlantRepository;
import com.n8ify.plantman.repository.PlantingRepository;
import com.n8ify.plantman.repository.ThreadRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractPlantmanService extends AbstractService {

    @Autowired
    protected PlantingRepository plantingRepository;

    @Autowired
    protected PlantRepository plantRepository;

    @Autowired
    protected ThreadRepository threadRepository;



}
