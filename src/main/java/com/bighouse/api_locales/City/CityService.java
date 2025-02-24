package com.bighouse.api_locales.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDTO> SearchCityName(String country, String state){
        return cityRepository.findByCountryAndState(country, state);
    }

}
