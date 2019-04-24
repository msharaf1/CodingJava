package com.product.product.services;

import com.product.product.models.Product;
import com.product.product.repositories.ProdRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServ {
    private ProdRepo prodRepo;

    public ProdServ(ProdRepo prodRepo){ this.prodRepo = prodRepo;}

    public List<Product> findAllProduct(){
        return prodRepo.findAll();
    }
    public Product findByIdProd(Long id){
        return prodRepo.findById(id).get();
    }

    public Product addProduct(Product product){
//        product.setDesc(product.getDesc());
        return prodRepo.save(product);
    }
    public void deleteProduct(long id){
        prodRepo.deleteById(id);
    }
    public Product editProduct(Product product){
        return prodRepo.save(product);
    }

}
