package com.kripa.gurucourse.brewery.service;

import com.kripa.gurucourse.brewery.model.BeerDto;
import org.springframework.stereotype.Service;


@Service
public class BeerServiceImp implements BeerService {

    @Override
    public BeerDto getBeerById(Long beerId) {
        BeerDto dto = new BeerDto();
        dto.setId(1L);
        dto.setBeerName("Corona");
        dto.setBeerStyle("Beer");
        dto.setUpc(10L);
        return dto;
    }

	@Override
	public BeerDto savedBeer(BeerDto beerDto) {
		BeerDto dto = new BeerDto();
		dto.setId(beerDto.getId());
		dto.setBeerName(beerDto.getBeerName());
		dto.setBeerStyle(beerDto.getBeerStyle());
		dto.setUpc(beerDto.getUpc());
		return dto;
	}

	@Override
	public void updateBeer(Long id, BeerDto dto) {
		
	}

	@Override
	public void deleteBeer(Long id) {
		System.out.println("Delete id" + id);
	}
}
