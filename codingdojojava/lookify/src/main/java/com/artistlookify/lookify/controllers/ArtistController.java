package com.artistlookify.lookify.controllers;

import java.util.List;

import com.artistlookify.lookify.models.Artist;
import com.artistlookify.lookify.services.ArtistService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
@RequestMapping("/artist")
public class ArtistController {
    ArtistService artSer;
    public ArtistController(ArtistService artSer){
        this.artSer = artSer;
    }

    @GetMapping("")
    public List<Artist> indexPage(Model model){
        // model.addAttribute("artistList", artSer.findArtists());
        return artSer.findArtists();
    }

    @PostMapping("/new")
    public void addNewArtist(@RequestParam("title") String title, @RequestParam("artistName") String artistName, @RequestParam("rating") int rating){
        Artist artist = new Artist(title, artistName, rating);
        artSer.createArtistService(artist);
    }

    // @PostMapping("/{name}")
    // public Artist findName(@PathVariable("artistName") String artistName){
    //     List<Artist> foundByName = (Artist) artSer.findArtByName(artistName);
    //     System.out.println(foundByName);
    //     return foundByName;
    // }

    

}