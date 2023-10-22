/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.platzi.course.persistence.mapper;

import com.platzi.course.domain.Purchase;
import com.platzi.course.persistence.entity.Compra;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
/**
 *
 * @author ACER
 */

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
        @Mapping(source = "idCompra", target = "purchaseId"),
        @Mapping(source = "idCliente", target = "clientId"),
        @Mapping(source = "fecha", target = "date"),
        @Mapping(source = "medioPago", target = "paymentMethod"),
        @Mapping(source = "comentario", target = "comment"),
        @Mapping(source = "estado", target = "state"),
        @Mapping(source = "productos", target = "item")
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);
    
    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
