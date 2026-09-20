package com.todocodeacademy.prueba_tecnica_ferreteria.mapper;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.ProductDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.MapperConstants.*;

@Component
public class ProductMapper implements Mapper<ProductDTO, Product> {

    @Override
    public Product mapDTOtoEntity(ProductDTO dto) {

        if (dto == null) throw new NullPointerException(NULL_DTO_INPUT);

        return Product.builder()
                .name(dto.getName())
                .brand(dto.getBrand())
                .category(dto.getCategory())
                .price(dto.getPrice())
                .currentStock(dto.getCurrentStock())
                .build();
    }

    @Override
    public ProductDTO mapEntityToDTO(Product entity) {

        if (entity == null) throw new NullPointerException(NULL_ENTITY_INPUT);

        return ProductDTO.builder()
                .name(entity.getName())
                .brand(entity.getBrand())
                .category(entity.getCategory())
                .price(entity.getPrice())
                .currentStock(entity.getCurrentStock())
                .build();
    }

    @Override
    public List<ProductDTO> mapEntityListToDTOList(List<Product> entityList) {

        if (entityList == null) throw new NullPointerException(NULL_ENTITY_LIST_INPUT);

        return entityList.stream().map(this::mapEntityToDTO).toList();
    }
}
