package com.example.orderservice.dto;

import java.math.BigDecimal;

public class OrderLineItemDto {
    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
