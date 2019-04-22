package com.product.product.repositories;

import com.product.product.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface prodRepo extends CrudRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);

    List<Product> findAll();
}
