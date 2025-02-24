package com.bighouse.api_locales.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryDTO> SearchCountryName(){
        return countryRepository.findAllCountries();
    }

    public List<CountryPhoneCodeDTO> getAllPhoneCodeAndEmojis(){
        return countryRepository.findAllCode();
    }
}
