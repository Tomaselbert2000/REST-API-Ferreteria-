package com.todocodeacademy.prueba_tecnica_ferreteria.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class BrandInputDTO {

    private String name;
    private String description;
}
