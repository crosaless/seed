package com.seed.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPerdidaInventario {
    @Test
    public void testPerdidaInventario(){
        Inventario i= new Inventario();
        assertEquals(10,i.Perdida(20, 30));
    }

}
