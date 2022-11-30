package com.knoldus.onetomany.repository;

import com.knoldus.onetomany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
