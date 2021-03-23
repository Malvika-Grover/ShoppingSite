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
@Table(name = "role")

//Database - Role Table's columns and it's attributes

public class Role {

    @Id
    private Long id;

    @Column(name = "role_name")
    private ROLE roleName;

    @Column(name = "is_active")
    private String isActive;
}
