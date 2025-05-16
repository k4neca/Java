package com.caioalmeida.demo.repository;

import com.caioalmeida.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
