package com.seed.entidades;


public class Potencia {
    int nro1;
    public int potencia(int nro, int pot) {
        int resultado = 1;
        for (int i = 0; i < pot; i++) {
            resultado *= nro;
        }
        return resultado;
    }
}
