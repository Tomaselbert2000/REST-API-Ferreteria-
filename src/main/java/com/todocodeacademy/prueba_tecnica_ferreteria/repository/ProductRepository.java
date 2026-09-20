package com.todocodeacademy.prueba_tecnica_ferreteria.repository;

import com.todocodeacademy.prueba_tecnica_ferreteria.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
