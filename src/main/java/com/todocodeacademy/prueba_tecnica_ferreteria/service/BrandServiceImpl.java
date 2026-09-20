package com.todocodeacademy.prueba_tecnica_ferreteria.service;

import com.todocodeacademy.prueba_tecnica_ferreteria.dto.BrandDTO;
import com.todocodeacademy.prueba_tecnica_ferreteria.exceptions.BusinessException;
import com.todocodeacademy.prueba_tecnica_ferreteria.mapper.BrandMapper;
import com.todocodeacademy.prueba_tecnica_ferreteria.model.Brand;
import com.todocodeacademy.prueba_tecnica_ferreteria.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.todocodeacademy.prueba_tecnica_ferreteria.constants.TextConstants.ExceptionMessages.BRAND_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository repository;
    private final BrandMapper mapper;

    @Override
    @Transactional
    public void createBrand(BrandDTO dto) {

        Brand brand = mapper.mapDTOtoEntity(dto);

        repository.save(brand);
    }

    @Override
    @Transactional
    public void deleteBrand(Long id) {

        Brand brand = searchBrandOnRepo(id);

        repository.delete(brand);
    }

    @Override
    @Transactional
    public void updateBrand(Long id, BrandDTO dto) {

        Brand brand = searchBrandOnRepo(id);

        brand.setName(dto.getName());
        brand.setDescription(dto.getDescription());

        repository.save(brand);
    }

    @Override
    @Transactional(readOnly = true)
    public BrandDTO getBrandInfo(Long id) {

        Brand brand = searchBrandOnRepo(id);

        return mapper.mapEntityToDTO(brand);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BrandDTO> getAllBrands() {

        List<Brand> brands = repository.findAll();

        return mapper.mapEntityListToDTOList(brands);
    }

    private Brand searchBrandOnRepo(Long id) {

        return repository.findById(id).orElseThrow(() -> new BusinessException(BRAND_NOT_FOUND));
    }
}
