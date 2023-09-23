package com.microservice.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.productservice.model.Product;
import com.microservice.productservice.request.ProductRequest;
import com.microservice.productservice.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/create")
	public void createProduct(@RequestBody ProductRequest product) {
		productService.createProduct(product);
	}

	@GetMapping("")
	public List<Product> getAllProduct() {
		return productService.getProducts();
	}
}
