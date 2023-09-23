package com.microservice.orderservice.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microservice.orderservice.model.OrderLineItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OrderRequest {

	@JsonProperty("order_line_items")
	private List<OrderLineItemRequest> orderLineItems;
	
	public OrderLineItem mapToDto(OrderLineItemRequest request) {
		OrderLineItem item = new OrderLineItem();
		item.setPrice(request.getPrice());
		item.setQuantity(request.getQuantity());
		item.setSkuCode(request.getSkuCode());
		return item;
	}
}
