package com.todocodeacademy.prueba_tecnica_ferreteria.enums;

import lombok.Getter;

@Getter
public enum ProductCategory {

    HERRAMIENTAS_MANUALES("Martillos, destornilladores, llaves, etc."),
    ELECTRICIDAD_E_ILUMINACION("Interruptores, focos, cables eléctricos"),
    FONTANERIA("Grifos, tuberías, accesorios sanitarios"),
    PINTURAS_Y_ACABADOS("Pinturas, barnices, rodillos de pintura"),
    AISLAMIENTO_TERMICO("Lana mineral, aislantes para tuberías"),
    SEGURIDAD_INDUSTRIAL("Cascos, guantes protectores, gafas de seguridad"),
    ESTRUCTURAS_METALICAS("Perfiles metálicos, viguetas, varillas"),
    MATERIALES_DE_CONSTRUCCION("Ladrillos, bloques, cemento, arena"),
    PISOS_Y_PORCHES("Porcelanatos, cerámicas, parquet de madera"),
    PUERTAS_VENTANAS("Puertas metálicas/wooden, ventanas PVC/aluminio"),
    JARDINERIA_EXTERIOR("Macetas, herramientas jardín, riego exterior"),
    INSTALACIONES_SANEAMIENTO("Baños completos, duchas sanitarias"),
    COCINAS_BANOS_COMPLETAS("Cocinas modulares, baños integrados"),
    PINTURAS_PROTECTORAS("Pinturas anticorrosivas para estructuras metálicas"),
    MATERIALES_ELECTRICIDAD("Tableros eléctricos, enchufes, cajas de paso");

    private final String description;

    ProductCategory(String description) {
        this.description = description;
    }
}
