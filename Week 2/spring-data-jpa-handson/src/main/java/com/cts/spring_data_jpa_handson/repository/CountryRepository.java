package com.cts.spring_data_jpa_handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.spring_data_jpa_handson.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

}