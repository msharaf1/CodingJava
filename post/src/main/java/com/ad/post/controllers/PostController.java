package com.ad.post.controllers;

import com.ad.post.models.Post;
import com.ad.post.repositories.PostRepository;
import com.ad.post.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PostController {
//    @Autowired;
    private PostRepository postRepo;
    private PostService postSer;

    public PostController(PostService postSer, PostRepository postRepo){
        this.postRepo = postRepo;
        this.postSer = postSer;
    }

    @GetMapping("/posts")
    public String showPost(@ModelAttribute("post") Post post){

        return "index";
    }

    @PostMapping("/posts/new")
    public String createPost(@Valid @ModelAttribute("posts") Post posts, BindingResult result){
        if(result.hasErrors()){
            return "/posts";
        }else {
            Post savedPost = postSer.savePost(posts);
            return "/posts" + savedPost.getId();
        }
    }
}