package com.example.Belt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Belt.models.User;
import com.example.Belt.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	
	public UserService (UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public List<User> findAll(){
		return (List<User>) userRepo.findAll();
	}
	public User create(User user) {
		return userRepo.save(user);
	}
	public User findById(Long id) {
		return userRepo.findById(id).get();
	}
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	public User findByEmailAndPassword(String email, String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}
	public User update(User user) {
		return userRepo.save(user);
	}
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
	

}


