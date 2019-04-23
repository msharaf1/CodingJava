package com.product.product.repositories;

import com.product.product.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CatRepo extends CrudRepository<Category, Long> {
    @Override
    Optional<Category> findById(Long id);

    List<Category> findAll();

//    @Override
//    void delete(Category id);
}
