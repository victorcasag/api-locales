package com.bighouse.api_locales.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT new com.bighouse.api_locales.Country.CountryPhoneCodeDTO(c.phoneCode, c.emojiU) FROM Country c")
    List<CountryPhoneCodeDTO> findAllCode();
    @Query("SELECT new com.bighouse.api_locales.Country.CountryDTO(c.name) FROM Country c")
    List<CountryDTO> findAllCountries();
}
