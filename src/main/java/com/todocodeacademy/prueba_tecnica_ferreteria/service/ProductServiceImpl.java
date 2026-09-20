package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.ProductDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    @Transactional
    public void createProduct(ProductDTO dto) {

    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {

    }

    @Override
    @Transactional
    public void updateProduct(Long id, ProductDTO dto) {

    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTO getProductInfo(Long id) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTO> getAllProducts() {

        return List.of();
    }
}
