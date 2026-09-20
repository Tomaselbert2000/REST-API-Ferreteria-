package com.todocodeacademy.prueba_tecnica_ferreteria.controller;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.ProductDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ControllerConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @GetMapping("/{id}")
    public ProductDTO getProductInfoByID(@PathVariable Long id) {

        return service.getProductInfo(id);
    }

    @GetMapping("/all")
    public List<ProductDTO> getAllProducts() {

        return service.getAllProducts();
    }

    @PostMapping("/create")
    public String createProduct(@RequestBody ProductDTO dto) {

        service.createProduct(dto);

        return PRODUCT_CREATED_SUCCESSFULLY;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {

        service.deleteProduct(id);

        return PRODUCT_DELETED_SUCCESSFULLY;
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody ProductDTO dto) {

        service.updateProduct(id, dto);

        return PRODUCT_UPDATED_SUCCESSFULLY;
    }
}
