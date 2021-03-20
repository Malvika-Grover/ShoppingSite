package com.shoppingSite.model;
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
@Table

public class User {

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

