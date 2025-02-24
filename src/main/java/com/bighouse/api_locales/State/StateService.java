package com.bighouse.api_locales.State;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    private StateRepository stateRepository;

    @Autowired
    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public List<StateDTO> SearchStateName(String country){
        return stateRepository.findByCountryName(country);
    }
}
