package com.shoppingSite.service;

import com.shoppingSite.Dto.ProductUpdateRequestDto;
import com.shoppingSite.model.Product;

import java.util.List;

public interface ProductService {
    public void save(Product product);

    public void delete(Product product);

    public  void update(ProductUpdateRequestDto product);

    public List<Product> getProducts();
}
