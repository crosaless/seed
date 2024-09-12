package com.seed.entidades;

/**
 * Clase que realiza la operación de resta de dos números enteros.
 * Esta clase es final para evitar que sea extendida.
 */
public final class Resta {

    /**
     * Resta dos números enteros.
     *
     * @param minuendo el primer número entero (minuendo).
     * @param sustraendo el segundo número entero (sustraendo).
     * @return el resultado de la resta.
     * @throws IllegalArgumentException si el minuendo es menor que el
     * sustraendo.
     */
    public int restar(final int minuendo, final int sustraendo) {
        if (minuendo < sustraendo) {
            throw new IllegalArgumentException(
                    "El minuendo no puede ser menor que el sustraendo."
            );
        }
        return minuendo - sustraendo;
    }
}

