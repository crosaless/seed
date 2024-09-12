package com.seed.entidades;

/**
 * Clase que realiza la operación de división de dos números enteros.
 */
public class Division {

    /**
     * Divide dos números enteros.
     *
     * @param a
     *            el dividendo.
     * @param b
     *            el divisor. No puede ser cero.
     * 
     * @return el resultado de la división como un valor de tipo doble.
     * 
     * @throws IllegalArgumentException
     *             si el divisor es cero.
     */
    public double dividir(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return (double) a / b;
    }
}
