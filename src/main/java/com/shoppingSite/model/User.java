package com.shoppingSite.model;
import com.shoppingSite.enums.ROLE;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "User")

//Database - User Table's columns and it's attributes

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private ROLE role;

    @Column(name = "mobile_number")
    private int mobileNumber;

    @Column(name = "is_active")
    private boolean isActive;

}

