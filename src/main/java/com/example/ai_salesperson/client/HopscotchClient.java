package com.example.ai_salesperson.client;

import com.example.ai_salesperson.dto.AddToCartRequest;
import com.example.ai_salesperson.dto.PlaceOrderRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "hopscotchClient", url = "https://www.hopscotch.in/api", configuration = FeignClientConfiguration.class)
public interface HopscotchClient {
    @GetMapping("search/product/v3")
    String searchProducts(@RequestParam("filterQuery") String filterQuery,
                          @RequestParam("keyWord") String keyWord,
                          @RequestParam("pageNo") int pageNo,
                          @RequestParam("pageSize") int pageSize,
                          @RequestParam("searchBy") String searchBy);

    @GetMapping("/delivery/addresses/v2")
    String getCustomerAddress();

    @PostMapping("/shopping-cart/add-product/v2")
    String addToCart(@RequestBody AddToCartRequest addToCartRequest);

    @PutMapping("/delivery/selectAddress/{addressId}")
    String selectAddress(@PathVariable String addressId);

    @PostMapping("/checkout/v4/place-order")
    String placeOrder(@RequestBody PlaceOrderRequest placeOrderRequest);
}
