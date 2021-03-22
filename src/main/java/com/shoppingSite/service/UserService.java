package com.shoppingSite.service;

import com.shoppingSite.enums.ROLE;
import com.shoppingSite.model.User;

public interface UserService {
    User getUser(String username);

    User getUserById(Long id);

    User userAuthentication();
}
