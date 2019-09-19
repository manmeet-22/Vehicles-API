package com.udacity.vehicles.domain.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface CarRepository.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
