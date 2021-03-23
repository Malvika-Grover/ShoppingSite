package com.shoppingSite.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateRequestDto {
    private Long id;
    private Integer unitsPurchased;
    private Double price;
    private Integer unitInStock;
}
