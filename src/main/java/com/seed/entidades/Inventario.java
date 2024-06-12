package com.seed.entidades;

public class Inventario {

    public int Venta(int cantVendida, int cantActual){
        return cantActual = cantActual -cantVendida;
    } 

    public int Reposicion(int cantRepuesta, int cantActual){
        return cantActual = cantActual + cantRepuesta;
    } 

    public int Perdida(int cantPerdida, int cantActual){
        return cantActual = cantActual - cantPerdida;
    }
}
    