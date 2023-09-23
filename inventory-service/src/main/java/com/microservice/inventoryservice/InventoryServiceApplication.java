package com.microservice.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.microservice.inventoryservice.model.Inventory;
import com.microservice.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository repository) {
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_13");
//			inventory.setQuantity(100);
//
//			Inventory inventory2 = new Inventory();
//			inventory.setSkuCode("iphone_13_red");
//			inventory.setQuantity(0);
//
//			repository.save(inventory);
//			repository.save(inventory2);
//		};
//	}

}
