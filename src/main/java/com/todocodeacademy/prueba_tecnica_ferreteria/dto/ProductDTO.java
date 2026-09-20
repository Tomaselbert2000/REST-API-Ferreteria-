package com.todocodeacademy.prueba_tecnica_ferreteria.dto;

import com.todocodeacademy.prueba_tecnica_ferreteria.enums.ProductCategory;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Brand;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class ProductDTO {

    private String name;
    private Brand brand;
    private ProductCategory category;
    private BigDecimal price;
    private Integer currentStock;
}
