package com.shoppingSite.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long usersId;

    private String username;

    private String password;

    private String role;

    private int mobileNumber;

    private char email;

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean isActive;

    public boolean isEnabled() {
        return isActive;
    }

    public void setEnabled(boolean isActive) {
        this.isActive = isActive;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String password) {
        this.role = role;
    }

    public int getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(){
        this.mobileNumber = mobileNumber;
    }

    public int getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

}

