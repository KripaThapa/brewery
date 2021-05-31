package com.kripa.guru.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto {
	private Long id;
	private Integer version;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime lasModifiedDate;
	
	private String beerName;
	private BeerStyleEnum beerStyle;
	
	private Long upc;
	
	private BigDecimal price;
	
	private Integer quantityOnHand;
}
