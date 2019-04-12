package com.fds.cars.repositories;

import java.util.List;
import java.util.Optional;

import com.fds.cars.models.CarModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICar extends CrudRepository<CarModel, Long>{

    // List<CarModel> findAll(Long id);
    // Optional<CarModel> findById (Long id);
    // Long deleteById(long id);
    Optional<CarModel> findById(Long id);
    List<CarModel> findAll();
}