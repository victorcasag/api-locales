package com.bighouse.api_locales.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
    @Query("SELECT new com.bighouse.api_locales.City.CityDTO(c.name) FROM City c WHERE c.countryName = :country AND c.stateName = :state")
    List<CityDTO> findByCountryAndState(String country, String state);
}
