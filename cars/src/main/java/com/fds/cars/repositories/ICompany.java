package com.fds.cars.repositories;

import java.util.List;
import java.util.Optional;

import com.fds.cars.models.CompanyModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompany extends CrudRepository<CompanyModel, Long>{

    // Optional<CompanyModel> findById(Long id);
    // List<CompanyModel> findByAll();
    Optional<CompanyModel> findById(Long id);
    List<CompanyModel> findAll();

}