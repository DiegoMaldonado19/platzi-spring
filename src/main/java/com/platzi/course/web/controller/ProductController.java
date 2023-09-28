/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.web.controller;

import com.platzi.course.domain.Product;
import com.platzi.course.domain.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CARIadmin
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    public List<Product> getAll(){
        return productService.getAll();
    }
    
    public Optional<Product> getProdut(int productId){
        return productService.getProduct(productId);
    }
    
    public Optional<List<Product>> getByCategory(int categoryId){
        return productService.getByCategory(categoryId);
    }
    
    public Product save(Product product){
        return productService.save(product);
    }
    
    public boolean delete(int productId){
        return productService.delete(productId);
    }
}
