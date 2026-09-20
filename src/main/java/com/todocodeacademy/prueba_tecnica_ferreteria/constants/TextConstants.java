package com.todocodeacademy.prueba_tecnica_ferreteria.constants;

public final class TextConstants {

    private TextConstants() {
    }

    public static final class MapperConstants {

        public static final String NULL_DTO_INPUT = "El DTO ingresado como parámetro del mapper es null";
        public static final String NULL_ENTITY_INPUT = "La entidad ingresada como parámetro del mapper es null";
        public static final String NULL_ENTITY_LIST_INPUT = "La lista de entidades ingresada como parámetro del mapper es null";
    }

    public static final class ValidationFailureMessages {

        public static final String IS_NULL = " es null";
        public static final String IS_NEGATIVE_OR_ZERO = " es negativo o igual a cero";
        public static final String IS_NEGATIVE = " es negativo";

        public static final String NAME = "El nombre ingresado";
        public static final String DESCRIPTION = "La descripción ingresada";
        public static final String CATEGORY = "La categoria ingresada";
        public static final String PRICE = "El precio";
        public static final String STOCK = "El stock de producto";

        public static final String NULL_NAME = NAME + IS_NULL;
        public static final String NULL_DESCRIPTION = DESCRIPTION + IS_NULL;
        public static final String NULL_CATEGORY = CATEGORY + IS_NULL;
        public static final String NEGATIVE_PRICE = PRICE + IS_NEGATIVE;
        public static final String NEGATIVE_STOCK = STOCK + IS_NEGATIVE_OR_ZERO;
    }

    public static final class ExceptionMessages {

        public static final String PRODUCT_NOT_FOUND = "No se encontraron productos con el ID proporcionado";
        public static final String BRAND_NOT_FOUND = "No se encontraron marcas con el ID proporcionado";
    }

    public static final class ControllerConstants {

        public static final String PRODUCT_CREATED_SUCCESSFULLY = "Producto creado exitosamente";
        public static final String PRODUCT_DELETED_SUCCESSFULLY = "Producto eliminado exitosamente";
        public static final String PRODUCT_UPDATED_SUCCESSFULLY = "Producto actualizado exitosamente";

        public static final String BRAND_CREATED_SUCCESSFULLY = "Marca de producto creada exitosamente";
        public static final String BRAND_DELETED_SUCCESSFULLY = "Marca de producto creada exitosamente";
        public static final String BRAND_UPDATED_SUCCESSFULLY = "Marca de producto actualizada exitosamente";
    }
}
