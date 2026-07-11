package com.cts.spring_data_jpa_handson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.spring_data_jpa_handson.entity.Country;
import com.cts.spring_data_jpa_handson.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }
    public Country addCountry(Country country) {
    return countryRepository.save(country);
}
}