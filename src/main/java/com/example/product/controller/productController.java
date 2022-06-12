package com.example.product.controller;

import com.example.product.Entites.Product;
import com.example.product.Repositories.ProductRepository;
import com.example.product.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class productController {


    @Autowired
    ProductServices productService;
    @Autowired
    ProductRepository productrepository;

    // select of all product
    /*
    @GetMapping("/listposts")
    public List<Product> getProduct(Model model){

        return productService.getProducts();
    }*/



    @GetMapping("/listproduct")
    public String listproduct(Model model){
        List<Product> products=productrepository.findAll();
        model.addAttribute("products", products);
        return "listproduct";
    }
  // the postProduct
    @GetMapping("/listposts/{id}")
    public Product getPost(@PathVariable Long id){
        return productService.getProduct(id);
    }
    // add the post
    @PostMapping(value = "/listposts")
    public String save(@RequestBody Product product){
        productService.saveProduct(product);
        return "addProduct";
    }

    //delete the post
    @DeleteMapping("/deleteproduits")
    public void delete(Long id){
        productrepository.deleteById(id);
    }
  /*  //update the post
    @PutMapping("/listposts/{id}")
    public void update(@PathVariable Long id,@RequestBody Product product){
        productService.updatePost(product,id);
    }
    */
}
