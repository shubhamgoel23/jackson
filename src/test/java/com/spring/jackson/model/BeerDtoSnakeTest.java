package com.spring.jackson.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
@ActiveProfiles("snake")
public class BeerDtoSnakeTest extends BaseTest {

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSnake() throws JsonProcessingException {
		BeerDto dto = getDto();

		String json = objectMapper.writeValueAsString(dto);

		System.out.println(json);
	}

}
