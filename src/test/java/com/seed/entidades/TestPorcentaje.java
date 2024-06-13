package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPorcentaje {

    @Test
    public void testCalcularPorcentaje() {
        Porcentaje porcentaje = new Porcentaje();
        double resultado = porcentaje.calcularPorcentaje(50, 200);
        assertEquals(25.0, resultado, 0.0001);
    }

    @Test
    public void testCalcularPorcentajeConParteCero() {
        Porcentaje porcentaje = new Porcentaje();
        double resultado = porcentaje.calcularPorcentaje(0, 200);
        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    public void testCalcularPorcentajeConTotalCero() {
        Porcentaje porcentaje = new Porcentaje();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            porcentaje.calcularPorcentaje(50, 0);
        });
        assertEquals("El total no puede ser cero", exception.getMessage());
    }

    @Test
    public void testCalcularPorcentajeParteIgualTotal() {
        Porcentaje porcentaje = new Porcentaje();
        double resultado = porcentaje.calcularPorcentaje(100, 100);
        assertEquals(100.0, resultado, 0.0001);
    }

    @Test
    public void testCalcularPorcentajeParteMayorTotal() {
        Porcentaje porcentaje = new Porcentaje();
        double resultado = porcentaje.calcularPorcentaje(150, 100);
        assertEquals(150.0, resultado, 0.0001);
    }

}
