package com.example.intern.repository;

import com.example.intern.model.CategoryTypeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryTypeId,Integer> {
}
