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

    //create artis
    public void createArtistService(Artist artist){
        artRepo.save(artist);
    }
    //return all
    public List<Artist> findArtists(){
        return artRepo.findAll();
    }
    //find by id
    public Optional<Artist> findArtByid(Long id){
        Optional<Artist> artistFound = artRepo.findById(id);
        return artistFound;
    }
    //find by name
    public List<Artist> findArtByName(String artistName){
        return artRepo.findByArtistName(artistName);
    }

    //update by id
    public Artist findWithId(Long id){
        Optional<Artist> findById = artRepo.findById(id);
        if(findById != null){
            return findById.get();
        }else{
            return null;
        }
    }

    //update
    public void updateArt(Artist artist){
        artRepo.save(artist);
    }

    //delte
    public void delteById(Long id){
        artRepo.deleteById(id);
    }

}//casss