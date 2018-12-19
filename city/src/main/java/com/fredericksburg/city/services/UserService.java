package com.fredericksburg.city.services;

import java.util.ArrayList;

import com.fredericksburg.city.models.User;
import com.fredericksburg.city.repositories.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService{
    private UserRepository userRepo;

    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public void createUser(User user){
        userRepo.save(user);
    }
    public User findById(Long id){
        return userRepo.findById(id).get();
    }

    public User findByEmail(String email){
        return userRepo.findByEmail(email);
    }
    public ArrayList<User> findAll(){
        return (ArrayList<User>) userRepo.findAll();
    }
    public void update(User user){
        userRepo.save(user);
    }
    public void delete(Long id){
        userRepo.deleteById(id);
    }
}