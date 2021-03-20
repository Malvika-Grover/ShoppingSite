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

public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long usersId;

    private String roleName;

    private String isActive;
}
