package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDivision {
    @Test
    public void testDividirPositivos() {
        Division division = new Division();
        double resultado = division.dividir(10, 2);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    public void testDividirNegativos() {
        Division division = new Division();
        double resultado = division.dividir(-10, -2);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    public void testDividirPositivoYNegativo() {
        Division division = new Division();
        double resultado = division.dividir(10, -2);
        assertEquals(-5.0, resultado, 0.0001);
    }

    @Test
    public void testDividirNegativoYPositivo() {
        Division division = new Division();
        double resultado = division.dividir(-10, 2);
        assertEquals(-5.0, resultado, 0.0001);
    }

    @Test
    public void testDividirPorUno() {
        Division division = new Division();
        double resultado = division.dividir(10, 1);
        assertEquals(10.0, resultado, 0.0001);
    }

    @Test
    public void testDividirCeroPorNumero() {
        Division division = new Division();
        double resultado = division.dividir(0, 5);
        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    public void testDividirPorCero() {
        Division division = new Division();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            division.dividir(10, 0);
        });
        assertEquals("El divisor no puede ser cero", exception.getMessage());
    }
}
