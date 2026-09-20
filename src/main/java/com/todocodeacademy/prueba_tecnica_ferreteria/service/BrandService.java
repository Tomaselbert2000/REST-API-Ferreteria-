package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.BrandDTO;

import java.util.List;

public interface BrandService {

    void createBrand(BrandDTO dto);

    void deleteBrand(Long id);

    void updateBrand(Long id, BrandDTO dto);

    BrandDTO getBrandInfo(Long id);

    List<BrandDTO> getAllBrands();
}
