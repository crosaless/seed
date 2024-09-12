package com.seed.entidades;

/**
 * Esta clase evalúa el mayor número en un arreglo. Puede ser extendida para implementar más métodos de evaluación.
 */
public final class Evaluador {

    /**
     * Encuentra el mayor número en el arreglo proporcionado.
     *
     * @param a
     *            el arreglo de enteros a evaluar.
     * 
     * @return el número mayor en el arreglo.
     */
    public int mayor(final int[] a) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        return mayor;
    }
}
