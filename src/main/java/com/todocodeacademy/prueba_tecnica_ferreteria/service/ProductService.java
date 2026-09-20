package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    void createProduct(ProductDTO dto);

    void deleteProduct(Long id);

    void updateProduct(Long id, ProductDTO dto);

    ProductDTO getProductInfo(Long id);

    List<ProductDTO> getAllProducts();
}
