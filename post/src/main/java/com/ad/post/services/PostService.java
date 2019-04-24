package com.ad.post.services;

import com.ad.post.models.Post;
import com.ad.post.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepo;

    public PostService(PostRepository postRepo){
        this.postRepo = postRepo;
    }


    public Post savePost(Post post){
        return postRepo.save(post);
    }



}