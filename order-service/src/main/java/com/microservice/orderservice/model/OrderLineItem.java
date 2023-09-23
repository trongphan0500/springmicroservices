package com.microservice.orderservice.model;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_line_items")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrderLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String skuCode;

	private BigDecimal price;

	
	private Integer quantity;
}
