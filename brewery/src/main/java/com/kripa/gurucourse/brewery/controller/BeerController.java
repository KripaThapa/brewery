package com.kripa.gurucourse.brewery.controller;

import com.kripa.gurucourse.brewery.model.BeerDto;
import com.kripa.gurucourse.brewery.service.BeerService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService service;

    public BeerController(BeerService service) {
        this.service = service;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable Long beerId){
        return new ResponseEntity<>(service.getBeerById(beerId), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<BeerDto> handPost(@RequestBody BeerDto beerDto) {
    	BeerDto dto= service.savedBeer(beerDto);
    	HttpHeaders headers = new HttpHeaders();
    	headers.add("Location", "/api/v1/beer"+dto.getId().toString());
    	return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity handleUpdate(@PathVariable Long id, @RequestBody BeerDto dto) {
    	service.updateBeer(id, dto);
    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @DeleteMapping("/{id}")
    public void handleDelete(@PathVariable Long id) {
    	service.deleteBeer(id);
    }
    
    
    
    
    
    
}
