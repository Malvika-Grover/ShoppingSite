package com.shoppingSite.serviceImpl;

import com.shoppingSite.enums.ROLE;
import com.shoppingSite.model.User;
import com.shoppingSite.repository.UserRepository;
import com.shoppingSite.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Override
    public User getUser(String username){
        return userRepository.findByUserNameAndIsActiveIsTrue(username);
    }

    @Override
    public  User getUserById(Long id){
        log.info("{}",id);
        return userRepository.getUserById(id);
    }
    @Override
    public User userAuthentication(){

        Long userId = Long.valueOf(httpServletRequest.getHeader("user"));

        if(null == userId)
        {
            log.info("user id is absent");
            return null;}
        return this.getUserById(userId);

    }

}
