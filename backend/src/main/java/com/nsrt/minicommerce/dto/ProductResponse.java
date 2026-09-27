package com.nsrt.minicommerce.dto;

public record ProductResponse(
        Long id,
        String name,
        Double price
) {
}