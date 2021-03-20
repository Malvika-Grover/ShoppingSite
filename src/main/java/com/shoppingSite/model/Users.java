package com.shoppingSite.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long usersId;

    private String username;

    private String password;

    private String role;

    private int mobileNumber;

    private char email;

    private boolean isActive;

}

