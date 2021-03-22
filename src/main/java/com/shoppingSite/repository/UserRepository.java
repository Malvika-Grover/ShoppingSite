package com.shoppingSite.repository;

import com.shoppingSite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

 public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserNameAndIsActiveIsTrue(String userName);

    @Query(nativeQuery = true , value = "select * from user where is_active=1 and id=?1")
    User getuser(Long id);

}