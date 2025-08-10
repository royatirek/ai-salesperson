package com.example.ai_salesperson;

import com.example.ai_salesperson.client.HopscotchClient;
import com.example.ai_salesperson.dto.AddToCartRequest;
import com.example.ai_salesperson.dto.PlaceOrderRequest;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class OrderMcpAdapter {

    private HopscotchClient hopscotchClient;

    public OrderMcpAdapter(HopscotchClient hopscotchClient) {
        this.hopscotchClient = hopscotchClient;
    }


    @Tool(description = "get customer all address")
    public String getCustomerAddresses() {
        return hopscotchClient.getCustomerAddress();
    }

    @Tool(description = "add sku to the cart")
    public String addSkuToCart(@ToolParam(description = "add sku to cart request sample request body ")
                               AddToCartRequest addToCartRequest) {
        return hopscotchClient.addToCart(addToCartRequest);
    }

    @Tool(description = "customer selects his preferred address after getting his all address using getCustomerAddresses()")
    public String selectCustomerAddress(@ToolParam(description = "id of the selected address") String addressId) {
        return hopscotchClient.selectAddress(addressId);
    }

    @Tool(description = "place order using cod")
    public String placeOrderUsingCOD() {
        return hopscotchClient.placeOrder(PlaceOrderRequest.builder().paymentCode("COD").creditsApplied(false).build());
    }

}
