package com.seed.entidades;

public class Producto {
    public int stock = 60;
    public int disminuir(int a){
        return stock= stock - a;
    }
}
