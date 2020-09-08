package com.example.msscbrewery.service;

import com.example.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerDetails(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Corona").beerStyle("Light").build();
    }
}
