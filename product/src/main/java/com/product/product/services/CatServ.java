package com.product.product.services;

import com.product.product.models.Category;
import com.product.product.repositories.CatRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServ {
    private CatRepo catRepo;

    public CatServ(CatRepo catRepo){
        this.catRepo = catRepo;
    }

    public List<Category> findAllCats(){
        return catRepo.findAll();
    }


    public void addCats(Category category){
        catRepo.save(category);
    }
    public void editCats(Category category){
        catRepo.save(category);
    }
    public void deleteCats(long id){
        catRepo.deleteById(id);
    }

}//class br
