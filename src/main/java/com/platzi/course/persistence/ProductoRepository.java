/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.persistence;

import com.platzi.course.persistence.crud.ProductoCrudRepository;
import com.platzi.course.persistence.entity.Producto;
import java.util.List;

/**
 *
 * @author CARIadmin
 */
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    
    /* Con este metodo obtenemos todas las listas de productos gracias  los 
    repos de Spring Data
    */
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
