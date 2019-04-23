package com.product.product.controllers;

import com.product.product.models.Product;
import com.product.product.services.ProdServ;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productObj")Product product, BindingResult result){
        System.out.println(product.getName());
        if(result.hasErrors()){
            return "redirect:/new/product";
        }else{
            pSer.addProduct(product);
            return "redirect:/";
        }
//        return "index";

    }

}
