package com.kripa.guru.bootstrap;

import com.kripa.guru.domain.Beer;
import com.kripa.guru.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                                    .beerName("Sletzer")
                                    .beerStyle("IPA")
                                    .quantityOnHand(20)
                                    .quantityToBrew(40)
                                    .upc(337010000L)
                                    .price(new BigDecimal("12.95"))
                                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("New")
                    .beerStyle("CPA")
                    .quantityOnHand(10)
                    .quantityToBrew(20)
                    .upc(337010001L)
                    .price(new BigDecimal("13.95"))
                    .build());
        }
        System.out.println("Loaded Beers" + beerRepository.count());
    }
}
