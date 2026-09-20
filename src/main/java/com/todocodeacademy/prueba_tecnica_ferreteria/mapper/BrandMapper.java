package com.todocodeacademy.prueba_tecnica_ferreteria.mapper;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.BrandDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.MapperConstants.*;

@Component
public class BrandMapper implements Mapper<BrandDTO, Brand> {

    @Override
    public Brand mapDTOtoEntity(BrandDTO dto) {

        if (dto == null) throw new NullPointerException(NULL_DTO_INPUT);

        return Brand.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .build();
    }

    @Override
    public BrandDTO mapEntityToDTO(Brand entity) {

        if (entity == null) throw new NullPointerException(NULL_ENTITY_INPUT);

        return BrandDTO.builder()
                .name(entity.getName())
                .description(entity.getDescription())
                .build();
    }

    @Override
    public List<BrandDTO> mapEntityListToDTOList(List<Brand> entityList) {

        if (entityList == null) throw new NullPointerException(NULL_ENTITY_LIST_INPUT);

        return entityList.stream().map(this::mapEntityToDTO).toList();
    }
}
