package com.fredericksburg.city.repositories;

import java.util.List;
import java.util.Optional;

import com.fredericksburg.city.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
    List<User>findAll();
    
    Optional<User> findById(Long id);
}