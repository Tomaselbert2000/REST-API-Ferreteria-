package com.todocodeacademy.prueba_tecnica_ferreteria.dto;

import com.todocodeacademy.prueba_tecnica_ferreteria.enums.ProductCategory;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Brand;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ValidationFailureMessages.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class ProductDTO {

    @NotNull(message = NULL_NAME)
    private String name;

    @NotNull(message = NULL_DESCRIPTION)
    private Brand brand;

    @NotNull(message = NULL_CATEGORY)
    private ProductCategory category;

    @Positive(message = NEGATIVE_PRICE)
    private BigDecimal price;

    @PositiveOrZero(message = NEGATIVE_STOCK)
    private Integer currentStock;
}
