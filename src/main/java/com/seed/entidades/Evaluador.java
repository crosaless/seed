package com.seed.entidades;

public class Evaluador {
    public int mayor(int[] a){
        int M = a[0];
        for(int i=1; i < a.length; i++){
            if(a[i] > M){
                M = a[i];
            }
        }
        return M;
    }
}
