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
    public void delete(Long id){
        if(null == id){
            log.info("No product exists");
        }
        Product product=productRepository.getProductByIdAndIsActiveIsTrue(id);
        product.setIsActive(false);
        this.save(product);
    }


    @Override
    public  void update(ProductUpdateRequestDto request) {
        if(null == request){
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
        productRepository.save(product);

    }


    @Override
    public List<Product>getProducts(){
       return productRepository.getProductByIsActiveAndUnitInStockGreaterThan(Boolean.TRUE,0);
    }
}
