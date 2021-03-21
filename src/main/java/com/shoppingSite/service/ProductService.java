package com.shoppingSite.service;

import com.shoppingSite.Dto.ProductUpdateReqeustDto;
import com.shoppingSite.model.Product;

import java.util.List;

public interface ProductService {
    public void save(Product product);

    public void delete(Product product);

    public  void update(ProductUpdateReqeustDto product);

    public List<Product> getProducts();
}
