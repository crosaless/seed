package com.seed.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestReposicionInventario {
    @Test
    public void testReposicionInventario() {
        Inventario i = new Inventario();
        assertEquals(30, i.reposicion(20, 10));
    }

}
