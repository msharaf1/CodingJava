package com.example.Belt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Belt.models.Idea;
import com.example.Belt.models.User;
import com.example.Belt.repositories.IdeaRepository;

@Service
public class IdeaService {
	private final IdeaRepository ideaRepo;
	
	public IdeaService (IdeaRepository ideaRepo) {
	    this.ideaRepo = ideaRepo;
	}

	public List<Idea> findAll(){
	    return (List<Idea>) ideaRepo.findAll();
	}
	public Idea create(Idea idea) {
	    return ideaRepo.save(idea);
	}
	public Idea findById(Long id) {
	    return ideaRepo.findById(id).get();
	}
	public List<Idea> findByCreator(User user) {
	    return ideaRepo.findByCreator(user);
	}
	public Idea update(Idea idea) {
	    return ideaRepo.save(idea);
	}
	public void delete(Long id) {
	    ideaRepo.deleteById(id);
	}
	public void likeIdea(Idea i, User u) {
		List<User> likers = i.getLikers();
		likers.add(u);
		i.setLikers(likers);
		ideaRepo.save(i);
	}
	public void unLinkIdea(Idea i, User u) {
		List<User> likers = i.getLikers();
		likers.remove(u);
		i.setLikers(likers);
		ideaRepo.save(i);
	}
	public List<User> listLikers(Idea i) {
		return i.getLikers();
	}
}
