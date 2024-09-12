package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMultiplicacion {
    @Test
    public void testMultipliacacion() {
        Multiplicacion multiplicacion = new Multiplicacion();
        assertEquals(6, multiplicacion.multiplicar(2, 3));
    }
}
