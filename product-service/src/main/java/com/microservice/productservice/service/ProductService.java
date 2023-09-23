package com.microservice.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.productservice.model.Product;
import com.microservice.productservice.repository.ProductRepository;
import com.microservice.productservice.request.ProductRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public void createProduct(ProductRequest product) {
		Product p = Product.builder().name(product.getName()).description(product.getDescription())
				.price(product.getPrice()).build();

		repository.save(p);
		log.info("Product saved sucessfully :", p.getId());
	}

	public List<Product> getProducts() {
		return repository.findAll();
	}

}
