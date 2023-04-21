package com.example.intern.repository;

import com.example.intern.model.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStatusRepo extends JpaRepository<ProductStatus,Integer> {
}
