package com.product.product.repositories;

import com.product.product.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    List<User> findAll();
}
