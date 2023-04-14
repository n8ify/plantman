package com.n8ify.plantman;

import com.n8ify.plantman.repository.PlantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlantmanApplicationTests {

	@Autowired
	private PlantRepository plantRepository;

	@Test
	void contextLoads() {
		System.out.println(plantRepository.findAll());
	}

}
