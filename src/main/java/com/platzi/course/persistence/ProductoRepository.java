/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.persistence;

import com.platzi.course.persistence.crud.ProductoCrudRepository;
import com.platzi.course.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CARIadmin
 */
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    
    /* Con este metodo obtenemos todas las listas de productos gracias  los 
    repos de Spring Data
    */
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    
    /* Query Methods Implementacion*/
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
    
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }
    
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
