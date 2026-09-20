package com.todocodeacademy.prueba_tecnica_ferreteria.model;

import com.todocodeacademy.prueba_tecnica_ferreteria.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    private BigDecimal price;

    private Integer currentStock;
}
