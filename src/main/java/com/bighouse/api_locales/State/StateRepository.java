package com.bighouse.api_locales.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    @Query("SELECT new com.bighouse.api_locales.State.StateDTO(s.name) FROM State s WHERE s.countryName = :country")
    List<StateDTO> findByCountryName(String country);
}
