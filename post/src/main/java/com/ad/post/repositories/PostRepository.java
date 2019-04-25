package com.ad.post.repositories;

import com.ad.post.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Optional<Post> findById(Long id);

    List<Post> findAll();

//    // this method find a book by their description
//    List<Post> findByDescriptionContaining(String search);
//
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//
//    // this method deletes a book that starts with a specific title
//    Long deleteByTitleStartingWith(String search);

}