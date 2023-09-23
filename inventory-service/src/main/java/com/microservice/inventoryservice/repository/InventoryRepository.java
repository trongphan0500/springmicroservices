package com.microservice.inventoryservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.inventoryservice.model.Inventory;;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
	List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
