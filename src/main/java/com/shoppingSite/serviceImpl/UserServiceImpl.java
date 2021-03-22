package com.shoppingSite.serviceImpl;

import com.shoppingSite.model.User;
import com.shoppingSite.repository.UserRepository;
import com.shoppingSite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
@Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String username){
        return userRepository.findByUserNameAndIsActiveIsTrue(username);
    }

}
