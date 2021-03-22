package com.shoppingSite.repository;

import com.shoppingSite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
  List<Product> findAllByIsActive(Boolean isActive);
}
