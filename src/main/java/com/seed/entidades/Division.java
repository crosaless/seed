package com.seed.entidades;

public class Division {

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double) a / b;
    }
}
