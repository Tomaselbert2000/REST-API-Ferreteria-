package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.BrandDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository repository;

    @Override
    @Transactional
    public void createBrand(BrandDTO dto) {

    }

    @Override
    @Transactional
    public void deleteBrand(Long id) {

    }

    @Override
    @Transactional
    public void updateBrand(Long id, BrandDTO dto) {

    }

    @Override
    @Transactional(readOnly = true)
    public BrandDTO getBrandInfo(Long id) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<BrandDTO> getAllBrands() {

        return List.of();
    }
}
