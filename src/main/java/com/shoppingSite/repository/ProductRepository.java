package com.shoppingSite.repository;

import com.shoppingSite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
  List<Product>getProductByIsActiveAndUnitInStockGreaterThan(Boolean is_active , Integer stocks);

  Product getProductByIdAndIsActiveIsTrue(Long id);
}
