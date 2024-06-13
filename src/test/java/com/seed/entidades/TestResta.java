package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestResta {

    @Test
    public void testRestarPositivos() {
        Resta resta = new Resta();
        int resultado = resta.restar(10, 5);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestarNegativos() {
        Resta resta = new Resta();
        int resultado = resta.restar(-10, -5);
        assertEquals(-5, resultado);
    }

    @Test
    public void testRestarPositivoYNegativo() {
        Resta resta = new Resta();
        int resultado = resta.restar(10, -5);
        assertEquals(15, resultado);
    }

    @Test
    public void testRestarNegativoYPositivo() {
        Resta resta = new Resta();
        int resultado = resta.restar(-10, 5);
        assertEquals(-15, resultado);
    }

    @Test
    public void testRestarConCero() {
        Resta resta = new Resta();
        int resultado = resta.restar(10, 0);
        assertEquals(10, resultado);

        resultado = resta.restar(0, 5);
        assertEquals(-5, resultado);
    }
}

