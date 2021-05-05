package com.kripa.gurucourse.brewery.service;

import com.kripa.gurucourse.brewery.model.BeerDto;



public interface BeerService {
    public BeerDto getBeerById(Long beerId);

	public BeerDto savedBeer(BeerDto beerDto);

	public void updateBeer(Long id, BeerDto dto);

	public void deleteBeer(Long id);
}
