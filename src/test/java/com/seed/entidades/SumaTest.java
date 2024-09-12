package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    @Test
    public void testSuma() {
        Suma suma = new Suma();
        assertEquals(105, suma.suma(100, 5));
    }
}
