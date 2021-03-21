package com.shoppingSite.controller;

import com.shoppingSite.Dto.ProductUpdateReqeustDto;
import com.shoppingSite.model.Product;
import com.shoppingSite.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;


@Slf4j
@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addProduct(@RequestBody Product product) {
        try {
            productService.save(product);
            return true;
        } catch (Exception e) {
            log.info("error: {}", e);
        }
        return false;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public boolean deleteProduct(@RequestBody Product product) {
        try {
            productService.delete(product);
            return true;
        } catch (Exception e) {
            log.info("error: {}", e);
        }
        return false;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public boolean updateProduct(@RequestBody ProductUpdateReqeustDto productRequest){
        try {
            productService.update(productRequest);
            return true;
        }catch (Exception e){
            log.info("error : {}",e );
        }
        return false;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Product> getproducts(){
        try {
           return productService.getProducts();
            }catch(Exception e){
                log.info("error : {}", e );
            }
            return new ArrayList<Product>();
        }


}