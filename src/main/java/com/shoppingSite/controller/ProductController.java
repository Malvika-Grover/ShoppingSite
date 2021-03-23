package com.shoppingSite.controller;


import com.shoppingSite.Dto.ProductUpdateRequestDto;
import com.shoppingSite.model.Product;

import com.shoppingSite.service.ProductService;
import com.shoppingSite.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;



@Slf4j
@RestController
@RequestMapping
        (value = "/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;

    //http://localhost:8080/product/add - To add new product into the DB
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

    //http://localhost:8080/product/delete - To delete some product from DB
    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public boolean deleteProduct(@RequestParam("id") Long id ) {

       /*
        User specific delete API
            -------------------------
            Role  |      Access
            -------------------------
            User  |     No Access
            Admin |     Access grant
            Seller|     Check on seller_id with product_id

        */

        /*
        User user=  userService.userAuthentication();
        log.info("{}",user.toString());
        if(null== user){
            log.info("invalid user");
            return false;
        }
        if(user.getRole().equals(ROLE.USER)){
            log.info("user is not authorised");
            return false;
        }
        */
        try {
            productService.delete(id);

            return true;
        } catch (Exception e) {
            log.info("error: {}", e);
        }
        return false;
    }


    //http://localhost:8080/product/update - To update some product(quantity) in DB
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public boolean updateProduct(@RequestBody ProductUpdateRequestDto productRequest){

           /*
        User specific update API
            -------------------------
            Role  |      Access
            -------------------------
            User  |     No Access
            Admin |     Access grant
            Seller|     Check on seller_id with product_id

        */


       /* User user=  userService.userAuthentication();
        log.info("{}",user.toString());
        if(null== user){
            log.info("invalid user");
            return false;
        }
        if(user.getRole().equals(ROLE.USER)){
            log.info("user is not authorised");
            return false;
        }*/
        try {
            productService.update(productRequest );
            return true;
        }catch (Exception e){
            log.info("error : {}",e );
        }
        return false;
    }


    //http://localhost:8080/product/get - To fetch all the products from DB
    //Accessed by people of every role
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