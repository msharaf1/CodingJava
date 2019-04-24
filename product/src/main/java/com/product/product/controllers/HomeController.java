package com.product.product.controllers;

import com.product.product.models.Product;
import com.product.product.repositories.ProdRepo;
import com.product.product.services.ProdServ;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {
    private ProdServ pSer;
    private ProdRepo prodRepo;

    public HomeController(ProdServ pSer, ProdRepo prodRepo){
        this.pSer = pSer;
        this.prodRepo = prodRepo;
    }


    @GetMapping(value = "/")
    public String homePage(){
        return "index";
    }

    @GetMapping(value = "/product/new")
    public String newProduct(@ModelAttribute("productObj") Product product){

        return "newproduct";
    }

//    @PostMapping("/product/add")
//    public String addProduct(@ModelAttribute("productObj")Product product, BindingResult result){
//        System.out.println(product.getName());
//        if(result.hasErrors()){
//            return "redirect:/new/product";
//        }else{
//            pSer.addProduct(product);
//            return "redirect:/";
//        }
////        return "index";
//
//    }

    @PostMapping("/product")
    public String addProduct(@Valid @ModelAttribute("productObj")Product product, BindingResult result){
        System.out.println(product.getName()+"It is from product route");
        if(result.hasErrors()){
            return "redirect:/product/new";
        }else{
            Product savedProd = pSer.addProduct(product);
            return "redirect:/"+savedProd.getId();
        }
//        return "index";

    }

}
