package com.microservice.orderservice.request;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemRequest {

	private int id;

	@JsonProperty("sku_code")
	private String skuCode;

	private BigDecimal price;

	private Integer quantity;
}
