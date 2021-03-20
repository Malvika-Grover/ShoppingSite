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
@Table


public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long productId;

    private String productName;

    private String productBrand;

    private String productModel;

    private String currency;

    private Double productPrice;

    private Integer unitInStock;

    private String productCategory;

    private String productDescription;

    private String sellerId;

    private Boolean isActive;


    @Transient
    private MultipartFile productImage;

}