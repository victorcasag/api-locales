package com.bighouse.api_locales.Country;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/all")
    public List<CountryDTO> getAllCountry(){
        return countryService.SearchCountryName();
    }

    @GetMapping("/getAllPhoneCodeAndEmojis")
    public List<CountryPhoneCodeDTO> getAllPhoneCodeAndEmojis(){
        return countryService.getAllPhoneCodeAndEmojis();
    }
}
