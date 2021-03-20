package com.shoppingSite.serviceImpl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements com.shoppingSite.servce.LoginService {
    @Override
    public Boolean isValidUser(String username, String password) {
        if(null == username && null == password){
            log.info("username or password is null");
            return false;
        }

        return true;
    }


}
