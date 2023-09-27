/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.persistence;

import com.platzi.course.domain.Product;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author CARIadmin
 */
public interface ProductRepository {
    List<Product> getAll();
    
    Optional<List<Product>> getByCategory(int categoryId);
    
    Optional<List<Product>> getScarseProducts(int quantity);
    
    Optional<List<Product>> getProduct(int productId);
    
    Product save(Product product);
    
    void delete(int productId);
}
