package com.brewery.client.breweryclient.client;

import com.brewery.client.breweryclient.model.BeerDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
@ConfigurationProperties(value="sfg.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    public final String BEER_PATH_V1= "/api/v1/beer/";
    private String apiHost;


    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
    public void setApiHost(String apiHost){
        this.apiHost = apiHost;
    }

    public BeerDto getBeerById(Long id){
        return restTemplate.getForObject(apiHost + BEER_PATH_V1 + id, BeerDto.class);
    }

    public URI saveNewBeer(BeerDto beerDto){
        return restTemplate.postForLocation(apiHost + BEER_PATH_V1, beerDto);
    }

    public void updateBeer(Long id, BeerDto dto){
         restTemplate.put(apiHost+BEER_PATH_V1+"/"+id,dto);
    }
}
