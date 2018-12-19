package com.amadon.msSales.repositories;

import com.amadon.msSales.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepostiory extends CrudRepository<User, Long> {
    User findByEmail(String Email);
    List<User> findAll();

    User findByEmailAndPassword (String email, String password);
    Optional<User> findById(Long id);

}