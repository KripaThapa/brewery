package com.brewery.client.breweryclient.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private Long id;
    private String beerName;
    private String beerStyle;
    private Long upc;



}
