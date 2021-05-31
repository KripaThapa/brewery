package com.brewery.client.breweryclient.client;

import com.brewery.client.breweryclient.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {
    @Autowired
    BreweryClient client;

    @Test
    void getBeerById(){
        BeerDto dto = client.getBeerById(1L);
        assertNotNull(dto);
    }
//    @Test
//    void saveBeer(){
//        BeerDto dto = BeerDto.builder().beerName("New_Beer").build();
//        URI uri = client.saveNewBeer(dto);
//        assertNotNull(uri);
//        System.out.println(uri.toString());
//    }

    @Test
    void updateBeer(){
        BeerDto dto = BeerDto.builder().beerName("New_Beer").build();
        client.updateBeer(1L, dto);
    }

}