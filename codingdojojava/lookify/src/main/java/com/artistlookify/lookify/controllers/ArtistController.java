package com.artistlookify.lookify.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import com.artistlookify.lookify.models.Artist;
import com.artistlookify.lookify.services.ArtistService;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController
// @RequestMapping("/")
public class ArtistController {
    ArtistService artSer;
    // Artist artistObj;
    public ArtistController(ArtistService artSer){
        this.artSer = artSer;
        // this.artistObj = artistObj;
    }

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("artistList", artSer.findArtists());
        // artSer.findArtists();
        return "index";
    }

    @GetMapping("/songs/new")
    //Make sure to ModelAttribute Artist to connect form:form jsp
    public String addNewSongs(@ModelAttribute("artistObj") Artist artist){
        return "newSongs";
    }
    @PostMapping("/songs/new")
    public String addSongs(@Valid @ModelAttribute("artistObj") Artist artist, BindingResult result){
        if(result.hasErrors()){
            return "newSongs";
        }
        artSer.createArtistService(artist);
        System.out.println(artist.getArtistName()+" "+artist.getRating());
        return "redirect:/dashboard";
    }
   
    @GetMapping("/dashboard")
    public String showDashboard(@ModelAttribute("artistObj") Artist artist,Model model){
        model.addAttribute("artistList", artSer.findArtists());
        return "dashboard";
    }
    @GetMapping("/dashboard/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
        artSer.delteById(id);
        return "redirect:/dashboard";
    }
    @GetMapping("/dashboard/topten")
    public String topTen(Model model){
        int count = 0;
        List<Artist> tenArtist = new ArrayList<>();
        model.addAttribute("tenArtist", tenArtist);
        while(count < 10){
            List<Artist> artists = artSer.findArtists();
            Collections.sort(artists);
            Collections.reverse(artists);
            tenArtist.add(artists.get(count));
            count++;
        }
        return "topten";
    }


    @PostMapping("/dashboard/search")
    public String findName(@RequestParam(value = "artistName") String artistName, Model model){
        List<Artist> artistsByName = artSer.findArtByName(artistName);
        Collections.sort(artistsByName);
        Collections.reverse(artistsByName);
        model.addAttribute("artistsByName", artistsByName);
        return "searchResult";
    }

    // @GetMapping("/dashboard/result")
    // public String searchResulted(Model model, HttpSession session){
    //     return "searchResult";
    // }
    

}