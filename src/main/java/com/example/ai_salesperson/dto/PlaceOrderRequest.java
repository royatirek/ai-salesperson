package com.example.ai_salesperson.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class PlaceOrderRequest {
    private String paymentCode;
    private Boolean creditsApplied;
}
