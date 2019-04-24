package com.product.product.repositories;

import com.product.product.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdRepo extends CrudRepository<Product, Long> {

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
