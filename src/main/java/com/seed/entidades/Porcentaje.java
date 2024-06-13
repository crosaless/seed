package com.seed.entidades;

public class Porcentaje {

    public double calcularPorcentaje(double parte, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("El total no puede ser cero");
        }
        return (parte / total) * 100;
    }
}
