package com.ad.post.controllers;

import com.ad.post.models.Post;
import com.ad.post.repositories.PostRepository;
import com.ad.post.services.PostService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class PostController {
    private PostRepository postRepo;
    private PostService postSer;

    public PostController(PostService postSer, PostRepository postRepo){
        this.postRepo = postRepo;
        this.postSer = postSer;
    }

    @GetMapping("/")
    public String showPage(Model model) {
        List<Post> posts = postSer.allPost();
        model.addAttribute("posts", posts);
        return "index";
    }

    @GetMapping("/posts")
    public String index(Model model) {
        List<Post> posts = postSer.allPost();
        model.addAttribute("posts", posts);
        return "index";
    }

    @GetMapping("/posts/new")
    public String newPost(@ModelAttribute("postObj") Post post) {
        return "newpost";
    }

    @PostMapping("/posts/new")
    public String create(@Valid @ModelAttribute("postObj") Post post, BindingResult result) {
        if (result.hasErrors()) {
            return "newpost";
        } else {
            postSer.savePost(post);
            return "redirect:/posts";
        }
    }//post/new

    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable("id") Long id){
        postSer.deletePost(id);
        return "redirect:/posts";
    }













//    @GetMapping("/posts")
//    public String showPost(@ModelAttribute("post") Post post){
//        System.out.println("It is from main Posts");
//
//        return "index";
//    }
//
//    @GetMapping("/posted")
//    public List<Post> showAllpost(@ModelAttribute("post") Post post){
//        return postSer.findAll();
//    }

//    @PostMapping("/posts/new")
//    public String createIdea(@ModelAttribute("idea") Idea idea, BindingResult result, HttpSession session, Model model){
//        if (idea.getContent().length() < 1) {
//            model.addAttribute("errors", "Must include content");
//            model.addAttribute("idea", new Idea());
//            System.out.println("1");
//            return "create";
//        } else {
//            Long user_id = (Long)session.getAttribute("id");
//            User creator =  uS.findById(user_id);
//            idea.setCreator(creator);
//            iS.create(idea);
//            return "redirect:/ideas";
//        }
//    }

//    @Controller
//    public class BooksController {
//        // other methods removed for brevity
//        @RequestMapping("/books/{id}/edit")
//        public String edit(@PathVariable("id") Long id, Model model) {
//            Book book = bookService.findBook(id);
//            model.addAttribute("book", book);
//            return "/books/edit.jsp";
//        }
//
//        @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
//        public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
//            if (result.hasErrors()) {
//                return "/books/edit.jsp";
//            } else {
//                bookService.updateBook(book);
//                return "redirect:/books";
//            }
//        }
//    }
//@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
//public String destroy(@PathVariable("id") Long id) {
//    bookService.deleteBook(id);
//    return "redirect:/books";
//}


}