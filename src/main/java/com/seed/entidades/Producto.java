package com.seed.entidades;

public class Producto {
    public int stock = 60;
    private String nombre;
    public int disminuir(int a){
        return stock= stock - a;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}