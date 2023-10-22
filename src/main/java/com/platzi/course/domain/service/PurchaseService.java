/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.course.domain.service;

import com.platzi.course.domain.Purchase;
import com.platzi.course.persistence.PurchaseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;
    
    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    
    public Optional<List<Purchase>> getByClient(String clientId){
        return purchaseRepository.getByClient(clientId);
    }
    
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
