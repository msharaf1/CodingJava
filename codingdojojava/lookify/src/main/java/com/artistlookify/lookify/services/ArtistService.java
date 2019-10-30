package com.artistlookify.lookify.services;

import java.util.List;
import java.util.Optional;

import com.artistlookify.lookify.models.Artist;
import com.artistlookify.lookify.repositories.ArtistRepository;

import org.springframework.stereotype.Service;

@Service
public class ArtistService {
    private ArtistRepository artRepo;

    public ArtistService(ArtistRepository artRepo){
        this.artRepo = artRepo;
    }

    public void createArtistService(Artist artist){
        artRepo.save(artist);
    }
    public List<Artist> findArtists(){
        return artRepo.findAll();
    }

    public Optional<Artist> findArtByid(Long id){
        Optional<Artist> artistFound = artRepo.findById(id);
        return artistFound;
    }
    public List<Artist> findArtByName(String artistName){
        return artRepo.findByArtistName(artistName);
    }
}