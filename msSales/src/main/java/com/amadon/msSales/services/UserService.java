package com.amadon.msSales.services;

import com.amadon.msSales.models.User;
import com.amadon.msSales.repositories.UserRepostiory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    //var
    private UserRepostiory userRepo;

    //constructor
    public UserService(UserRepostiory userRepo){
        this.userRepo = userRepo;
    }

    public void create(User user){
        userRepo.save(user);
        //return userRepo.save(user) get a copy of what you created.
    }

    public ArrayList<User> findAll(){
        return (ArrayList<User>) userRepo.findAll();
    }

    public User findById(Long id){
        return userRepo.findById(id).get();
    }

    public User findByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public User findByEmailAndPassword(String email, String password){
        return findByEmailAndPassword(email, password);
    }

    public User update(User user){
        return userRepo.save(user);
    }

    public void delete(Long id){
        userRepo.deleteById(id);
    }



}
