package com.microservice.inventoryservice.response;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;

    private boolean isInStock;
}
