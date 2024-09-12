package com.seed.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDevolverMayor {
    @Test
    public void testDevolverMayor() {
        int[] array = new int[] { 5, 7, 43, 21, 100, 500, 23 };
        Evaluador e = new Evaluador();
        assertEquals(500, e.mayor(array));
    }
}
