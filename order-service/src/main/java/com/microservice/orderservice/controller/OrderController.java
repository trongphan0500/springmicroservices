package com.microservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.orderservice.request.OrderRequest;
import com.microservice.orderservice.service.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/create-order")
	public String placeOrder(@RequestBody OrderRequest request) {
		orderService.createOrder(request);
		return "Order Placed Successfully";
	}
}
