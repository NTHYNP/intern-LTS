package com.example.intern.repository;

import com.example.intern.model.ProductImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImgRepo extends JpaRepository<ProductImg,Integer> {
}
