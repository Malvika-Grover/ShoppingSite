package com.shoppingSite.serviceImpl;

import com.shoppingSite.model.Product;
import com.shoppingSite.repository.ProductRepository;
import com.shoppingSite.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void save(Product product){
        if (null == product){
            log.info("product is null");
            return;
        }
        if( null == product.getProductName() || null ==product.getCurrency() || null == product.getProductPrice()
        || null == product.getProductCategory()||null == product.getUnitInStock()||null==product.getSellerId()){
            log.info("incomplete details ");
            return;
        }
        productRepository.save(product);
    }

    @Override
    public void delete(Product product){
        if(null ==product){
            log.info("no product is provided");
        }
        product.setIsActive(false);
        this.save(product);
    }
}
