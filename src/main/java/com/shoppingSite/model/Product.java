package com.shoppingSite.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")

//Database - Product Table's columns and it's attributes

public class Product {

    @Id
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "product_model")
    private String productModel;

    @Column(name = "currency")
    private String currency;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "unit_in_stock")
    private Integer unitInStock;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name="is_active")
    private Boolean isActive;


}