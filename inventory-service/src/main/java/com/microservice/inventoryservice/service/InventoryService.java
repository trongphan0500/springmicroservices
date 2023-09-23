package com.microservice.inventoryservice.service;

import com.microservice.inventoryservice.model.Inventory;
import com.microservice.inventoryservice.response.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.inventoryservice.repository.InventoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    public List<InventoryResponse> isInStock(List<String> skuCode) {
        return repository.findBySkuCodeIn(skuCode).stream().map(inventory ->
                InventoryResponse.builder().skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0).build()
        ).collect(Collectors.toList());
    }
}
