package com.shoppingSite.service;

import com.shoppingSite.Dto.ProductUpdateRequestDto;
import com.shoppingSite.model.Product;
import com.shoppingSite.model.User;

import java.util.List;

public interface ProductService {
    public void save(Product product);

    public void delete(Long productId);


    public List<Product> getProducts();
    public void update(ProductUpdateRequestDto dto);

}
