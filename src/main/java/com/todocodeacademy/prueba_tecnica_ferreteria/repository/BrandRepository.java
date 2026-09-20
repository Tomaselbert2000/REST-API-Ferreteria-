package com.todocodeacademy.prueba_tecnica_ferreteria.repository;

import com.todocodeacademy.prueba_tecnica_ferreteria.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
