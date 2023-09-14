/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.platzi.course.persistence.crud;

import com.platzi.course.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CARIadmin
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
    /*
    @Query(value = "Select * From productos WHERE id_categoria = ?", nativeQuery=true
    */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    
    
    Optional<List<Producto>>  findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
