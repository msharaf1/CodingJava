package com.artistlookify.lookify.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
public class Artist {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Valid
    // @Size(min=5, message = "Please enter a valid title")
    private String title;

    // @Size(min=5, message = "Please enter a valid artist name")
    private String artistName;

    // @Size(min=5, max=10, message = "Please rate between 1-10")
    private int rating;
public Artist(String title, String artistName, int rating){
    this.title = title;
    this.artistName = artistName;
    this.rating = rating;
}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artist) {
        this.artistName = artist;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

 public Artist(){}   
}