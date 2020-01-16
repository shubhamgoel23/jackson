package com.spring.jackson.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
	
	BeerDto getDto() {
		return BeerDto.builder().beerName("BeerName").beerStyle("Ale").id(UUID.randomUUID())
				.createdDate(OffsetDateTime.now()).lastUpdatedDate(OffsetDateTime.now()).price(new BigDecimal("12.99")).myLocalDate(LocalDate.now())
				.upc(123123123123L).build();
	}

}
