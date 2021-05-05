package com.kripa.guru.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kripa.guru.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId){

		return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity saveBeer(@RequestBody BeerDto dto){
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@PutMapping("/{beerId}")
	public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto){
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
