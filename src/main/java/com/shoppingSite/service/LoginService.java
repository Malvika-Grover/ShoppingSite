package com.shoppingSite.service;

public interface LoginService {
    Boolean isValidUser(String username, String password);
    String getUsernameFromAuthToken(byte[] token);
}
