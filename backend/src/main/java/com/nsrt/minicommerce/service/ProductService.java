package com.nsrt.minicommerce.service;

import com.nsrt.minicommerce.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<ProductResponse> getProducts() {
        return List.of(
                new ProductResponse(1L, "Wireless Mouse", 24.99),
                new ProductResponse(2L, "Mechanical Keyboard", 79.99)
        );
    }
}