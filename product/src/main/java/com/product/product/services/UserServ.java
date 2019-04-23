package com.product.product.services;

import com.product.product.models.User;
import com.product.product.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServ {
    private UserRepo userRepo;

    public UserServ(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }
    public User findById(long id){
        return userRepo.findById(id).get();
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public void deleteUser(long id){
        userRepo.delete(findById(id));
    }

    public void editUser(User user){
        userRepo.save(user);
    }


}
