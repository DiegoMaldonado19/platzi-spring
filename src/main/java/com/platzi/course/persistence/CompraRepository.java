/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.persistence;

import com.platzi.course.domain.Purchase;
import com.platzi.course.persistence.crud.CompraCrudRepository;
import com.platzi.course.persistence.entity.Compra;
import com.platzi.course.persistence.mapper.PurchaseMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACER
 */
@Repository
public class CompraRepository implements PurchaseRepository{

    @Autowired
    private CompraCrudRepository compraCrudRepository;
    
    @Autowired
    private PurchaseMapper mapper;
    
    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
       Compra compra = mapper.toCompra(purchase);
       
       compra.getProductos().forEach(producto -> producto.setCompra(compra));
       
       return mapper.toPurchase(compraCrudRepository.save(compra));
    }    
}
