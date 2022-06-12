package com.example.product.controller;

import com.example.product.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class productController {


    @Autowired
    ProductServices productService;

    // select of all product
    /*
    @GetMapping("/listposts")
    public List<Product> getProduct(Model model){

        return productService.getProducts();
    }*/



    @GetMapping("/view")
    public String helloword(Model model){

        model.addAttribute("message", "Hello World!");
        return "view";
    }
 /*   // the postProduct
    @GetMapping("/listposts/{id}")
    public Product getPost(@PathVariable Long id){
        return productService.getPost(id);
    }
    // add the post
    @PostMapping(value = "/listposts")
    public void save(@RequestBody Product product){
        productService.savePost(product);
    }

    //delete the post
    @DeleteMapping("/listposts/{id}")
    public void delete(@PathVariable Long id){
        productService.deletePost(id);
    }
    //update the post
    @PutMapping("/listposts/{id}")
    public void update(@PathVariable Long id,@RequestBody Product product){
        productService.updatePost(product,id);
    }
    */
}
