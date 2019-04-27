package com.ad.post.services;

import com.ad.post.models.Post;
import com.ad.post.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepo;

    public PostService(PostRepository postRepo){
        this.postRepo = postRepo;
    }



    // returns all the Post
    public List<Post> allPost() {
        return postRepo.findAll();
    }

    //    public List<Post> findAll(){
//        return (List<Post>) postRepo.findAll();
//    }

    // creates a book
    public Post savePost(Post post){
        return postRepo.save(post);
    }

//    public Post createPost(Post post) {
//        return postRepo.save(post);
//    }

    // retrieves a Post
    public Post findPost(Long id) {
        Optional<Post> optionalPost = postRepo.findById(id);
        if(optionalPost.isPresent()) {
            return optionalPost.get();
        } else {
            return null;
        }
    }

    public void deletePost(Long id){
        postRepo.deleteById(id);
    }


}