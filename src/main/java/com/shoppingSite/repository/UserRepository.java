package com.shoppingSite.repository;

import com.shoppingSite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
 public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameIn(String username);

}