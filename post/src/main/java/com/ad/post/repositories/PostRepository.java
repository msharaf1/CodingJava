package com.ad.post.repositories;

import com.ad.post.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Override
    Optional<Post> findById(Long id);
    List<Post> findAllBy();

}