package com.todocodeacademy.prueba_tecnica_ferreteria.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ValidationFailureMessages.NULL_DESCRIPTION;
import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ValidationFailureMessages.NULL_NAME;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class BrandDTO {

    @NotNull(message = NULL_NAME)
    private String name;

    @NotNull(message = NULL_DESCRIPTION)
    private String description;
}
