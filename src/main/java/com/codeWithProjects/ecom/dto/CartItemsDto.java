package com.codeWithProjects.ecom.dto;

import lombok.Data;

@Data
public class CartItemsDto {

    private Long id;

    private Long price;

    private Long quantity;

    private Long orderId;

    private Long productId;

    private String productName;

    private byte[] returnedImg;

    private Long userId;


}
