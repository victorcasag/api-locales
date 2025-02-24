package com.bighouse.api_locales.City;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/city")
public class CityController {

    @Autowired
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/findAllCityByCountryAndStates/{country}/{state}")
    public List<CityDTO> getCity(@PathVariable @Valid String country, @PathVariable @Valid String state) {
        return cityService.SearchCityName(country, state);
    }

}
