package com.github.kennedy.countries.repositories;

import com.github.kennedy.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface para representar repositorio

public interface CountryRepository extends JpaRepository<Country, Long> {
}
