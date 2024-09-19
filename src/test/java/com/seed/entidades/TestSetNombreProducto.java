
package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSetNombreProducto {

    @Test
    public void testSetNombreProducto() {
        Producto producto = new Producto();
        producto.setNombreProducto("Heladera");
        assertEquals("Heladera", producto.getNombreProducto());
    }

}
