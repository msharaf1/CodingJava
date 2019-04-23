package com.product.product.controllers;

import com.product.product.models.Product;
import com.product.product.services.ProdServ;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private ProdServ pSer;

    public HomeController(ProdServ pSer){
        this.pSer = pSer;
    }
    @GetMapping(value = "/")
    public String homePage(){
        return "index";
    }

    @GetMapping(value = "/product/new")
    public String newProduct(@ModelAttribute("productObj") Product product){

        return "newproduct";
    }

//    @PostMapping("/new/product")
//    public String addProduct(@ModelAttribute("productObj")Product product, BindingResult result){
//        if(result.hasErrors()){
//            return "redirect:/new/product";
//        }else{
//            pSer.addProduct(product);
//            return "redirect:/";
//        }
//
//    }

}
