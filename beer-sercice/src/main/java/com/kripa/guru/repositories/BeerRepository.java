package com.kripa.guru.repositories;

import com.kripa.guru.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, Long> {
}
