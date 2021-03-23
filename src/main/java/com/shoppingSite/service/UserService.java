package com.shoppingSite.service;

import com.shoppingSite.enums.ROLE;
import com.shoppingSite.model.Product;
import com.shoppingSite.model.User;



public interface UserService {
    User getUser(String username);

    User getUserById(Long id);

    User userAuthentication();

    public void save(User user);
}
