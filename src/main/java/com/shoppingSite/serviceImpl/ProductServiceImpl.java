package com.shoppingSite.serviceImpl;

import com.shoppingSite.Dto.ProductUpdateRequestDto;
import com.shoppingSite.model.Product;
import com.shoppingSite.repository.ProductRepository;
import com.shoppingSite.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public void save(Product product){
        if (null == product){
            log.info("No product exists");
            return;
        }
        if( null == product.getProductName() || null ==product.getCurrency() || null == product.getProductPrice()
        || null == product.getProductCategory()||null == product.getUnitInStock()||null==product.getSellerId()){
            log.info("Incomplete Details ");
            return;
        }
        productRepository.save(product);
    }

    @Override
    public void delete(Product product){
        if(null ==product){
            log.info("No product exists");
        }
        product.setIsActive(false);
        this.save(product);
    }




    @Override
    public List<Product>getProducts(){
       return productRepository.findAllByIsActive(Boolean.TRUE);
    }

    @Override
    public void update(Product product) {
        if (null == product.getUnitInStock()){
            log.info("Product can't be less than 0");
        } else {
            this.save(product);
        }
    }

}
