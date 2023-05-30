package com.microservice.productservice.dto;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRequest {
    private String name;
    private String description;
    private double price;
}
