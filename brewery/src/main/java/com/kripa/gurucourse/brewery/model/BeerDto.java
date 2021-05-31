package com.kripa.gurucourse.brewery.model;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {

    private Long id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
