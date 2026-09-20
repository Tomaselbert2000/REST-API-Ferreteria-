package com.todocodeacademy.prueba_tecnica_ferreteria.mapper;

import java.util.List;

public interface Mapper<D, E> {

    E mapDTOtoEntity(D dto);

    D mapEntityToDTO(E entity);

    List<D> mapEntityListToDTOList(List<E> entityList);
}
