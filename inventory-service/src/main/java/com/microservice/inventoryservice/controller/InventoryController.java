package com.microservice.inventoryservice.controller;

import com.microservice.inventoryservice.response.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservice.inventoryservice.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("")
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
