package com.shoppingSite.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateRequestDto {

    // Attributes that can be updated while making a call for update
    private Long id;
    private Integer unitsPurchased;
    private Double price;
    private Integer unitInStock;
}
