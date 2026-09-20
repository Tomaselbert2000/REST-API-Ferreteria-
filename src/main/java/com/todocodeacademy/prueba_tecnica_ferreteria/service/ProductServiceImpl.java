package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.ProductDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.exceptions.BusinessException;
import com.todocodeacademy.prueba_tecnica_ferreteria.mapper.ProductMapper;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Product;
import com.todocodeacademy.prueba_tecnica_ferreteria.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ExceptionMessages.PRODUCT_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    @Transactional
    public void createProduct(ProductDTO dto) {

        Product product = mapper.mapDTOtoEntity(dto);

        repository.save(product);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {

        Product product = searchProductOnRepo(id);

        repository.delete(product);
    }

    @Override
    @Transactional
    public void updateProduct(Long id, ProductDTO dto) {

        Product product = searchProductOnRepo(id);

        product.setName(dto.getName());
        product.setBrand(dto.getBrand());
        product.setCategory(dto.getCategory());
        product.setPrice(dto.getPrice());
        product.setCurrentStock(dto.getCurrentStock());

        repository.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTO getProductInfo(Long id) {

        Product product = searchProductOnRepo(id);

        return mapper.mapEntityToDTO(product);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTO> getAllProducts() {

        List<Product> products = repository.findAll();

        return mapper.mapEntityListToDTOList(products);
    }

    private Product searchProductOnRepo(Long id) {

        return repository.findById(id).orElseThrow(() -> new BusinessException(PRODUCT_NOT_FOUND));
    }
}
