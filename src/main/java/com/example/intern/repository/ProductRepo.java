package com.example.intern.repository;

import com.example.intern.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(nativeQuery = true, value = "select * from product where productdetail like %:searchInput% limit 5")
    public List<Product> searchProductTop5(@Param("searchInput") String searchInput);
}
