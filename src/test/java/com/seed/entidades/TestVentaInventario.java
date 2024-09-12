package com.seed.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVentaInventario {
    @Test
    public void testVentaInventario() {
        Inventario i = new Inventario();
        assertEquals(20, i.venta(20, 40));
    }
}