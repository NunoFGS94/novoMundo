package com.mundoNovo.mundoNovo.repository;

import com.mundoNovo.mundoNovo.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
