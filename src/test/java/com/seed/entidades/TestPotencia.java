package com.seed.entidades;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPotencia {
    @Test
    public void PotenciaTest(){
        Potencia p = new Potencia();
        int base =2;
        int exponente= 4;
        assertEquals(16, p.potencia(base,exponente));
    }
}
