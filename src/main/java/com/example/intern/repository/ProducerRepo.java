package com.example.intern.repository;

import com.example.intern.model.Producer;
import com.example.intern.model.Product;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProducerRepo extends JpaRepository<Producer,Integer> {
}
