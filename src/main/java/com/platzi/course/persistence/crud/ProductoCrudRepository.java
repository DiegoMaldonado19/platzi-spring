/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.platzi.course.persistence.crud;

import com.platzi.course.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CARIadmin
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
}
