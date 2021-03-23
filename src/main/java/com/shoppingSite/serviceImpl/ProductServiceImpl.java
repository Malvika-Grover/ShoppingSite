package com.shoppingSite.serviceImpl;

import com.shoppingSite.Dto.ProductUpdateRequestDto;
import com.shoppingSite.model.Product;
import com.shoppingSite.model.User;
import com.shoppingSite.repository.ProductRepository;
import com.shoppingSite.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void save(Product product){
        if (null == product){
            log.info("No product exists");
            return;
        }
        if( null == product.getProductName() || null == product.getCurrency() || null == product.getProductPrice()
        || null == product.getProductCategory()||null == product.getUnitInStock()||null==product.getSellerId()){
            log.info("Incomplete Details ");
            return;
        }
        productRepository.save(product);
    }

    @Override
    public void delete(Long productId){
        if(null == productId  ){
            log.info("invalid request");
            return;
        }

        Product product=productRepository.getProductByIdAndIsActiveIsTrue(productId);

        product.setIsActive(false);
        this.save(product);
    }


    @Override
    public  void update(ProductUpdateRequestDto request) {
        if(null == request ){
            log.info("Unable to update, Unauthorized!");
            return;
        }
        if(null == request.getId()){
            log.info("product id absent");
            return;
        }
        Product product= productRepository.getProductByIdAndIsActiveIsTrue(request.getId());
        if(null != request.getUnitsPurchased() ||( request.getUnitsPurchased()<=product.getUnitInStock() && request.getUnitsPurchased()>0 )){
            product.setUnitInStock(product.getUnitInStock()-request.getUnitsPurchased());
        }
        if(null != request.getUnitInStock() && request.getUnitInStock()>0){
            product.setUnitInStock(product.getUnitInStock()+request.getUnitInStock());
        }
        if(null != request.getPrice() && request.getPrice()>0){
            product.setProductPrice(request.getPrice());
        }
        productRepository.save(product);

    }


    @Override
    public List<Product>getProducts(){
       return productRepository.getProductByIsActiveAndUnitInStockGreaterThan(Boolean.TRUE,0);
    }
}
