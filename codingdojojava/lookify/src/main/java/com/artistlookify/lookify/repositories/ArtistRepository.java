package com.artistlookify.lookify.repositories;

import java.util.List;
import java.util.Optional;

import com.artistlookify.lookify.models.Artist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{
    Optional<Artist> findById(Long id);
    List<Artist> findAll();

    List<Artist> findByArtistName(String artistName);
    List<Artist> findByTitle(String title);
}