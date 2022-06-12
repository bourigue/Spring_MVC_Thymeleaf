package com.example.product.Services;
import com.example.product.Entites.Product;
import com.example.product.Repositories.*;
import com.example.product.Repositories.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ProductServices{
    ProductRepository productRepository;


    public List<Product> getProducts(){ return productRepository.findAll(); }
    //select one post
    public  Product getProduct(Long id){ return productRepository.findById(id).get(); }
    // add the post
    public void saveProduct(Product post){ productRepository.save(post); }
    //delete post
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
    //update the post
    public void updateProduct(Product post,Long id){ post.setId(id);productRepository.save(post); }


}
