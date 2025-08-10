package com.example.ai_salesperson.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddToCartRequest {
    private String sku;
    private Integer quantity;
}
