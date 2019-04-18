package com.example.Belt.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Belt.models.Idea;
import com.example.Belt.models.User;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long>   {
	List<Idea> findByCreator(User creator);
	List<Idea> findAll();
	Optional<Idea> findById(Long id);
//	List <Event> findALLOrderByCountLikesAsc ()
//	List <Event> findALLOrderByLikesAsc ()

}
