package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDisminuirStock {
    @Test
    public void testDisminuirStock() {
        Producto p = new Producto();
        assertEquals(25, p.disminuir(35));
    }
}
