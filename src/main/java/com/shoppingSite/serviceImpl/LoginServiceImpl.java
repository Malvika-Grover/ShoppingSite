package com.shoppingSite.serviceImpl;

import com.shoppingSite.model.User;
import com.shoppingSite.repository.UserRepository;
import com.shoppingSite.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;


    //Check for user's credentials
    @Override
    public Boolean isValidUser(String username, String password) {
        if (null == username && null == password) {
            log.info("Username or Password is null");
            return false;
        }
        User user = userRepository.getUserById(1L);
        if (null == user) {
            log.info("Not a valid user");
            return false;
        }
        if (null == user.getPassword()) {
            log.info("Password is null");
            return false;
        }
        if (password.equals(user.getPassword())) {
            return true;
        }

        return false;
    }

    @Override
    public String getUsernameFromAuthToken(byte[] token) {
        String auth = Base64.decodeBase64(token).toString();
        int i =0;
        String username = "";
        while (auth.charAt(i) != ':') {
            username = username + auth.charAt(i);
            i++;

        }
        return username;

    }

}
