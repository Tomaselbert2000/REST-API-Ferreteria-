package com.todocodeacademy.prueba_tecnica_ferreteria.controller;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.BrandDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ControllerConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brands")
public class BrandController {

    private final BrandService service;

    @GetMapping("/{id}")
    public BrandDTO getBrandInfoByID(@PathVariable Long id) {

        return service.getBrandInfo(id);
    }

    @GetMapping("/all")
    public List<BrandDTO> getAllBrands() {

        return service.getAllBrands();
    }

    @PostMapping("/create")
    public String createBrand(@RequestBody BrandDTO dto) {

        service.createBrand(dto);

        return BRAND_CREATED_SUCCESSFULLY;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBrand(@PathVariable Long id) {

        service.deleteBrand(id);

        return BRAND_DELETED_SUCCESSFULLY;
    }

    @PutMapping("/update/{id}")
    public String updateBrand(@PathVariable Long id, @RequestBody BrandDTO dto) {

        service.updateBrand(id, dto);

        return BRAND_UPDATED_SUCCESSFULLY;
    }
}
