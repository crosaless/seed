package com.seed.entidades;

/**
 * Esta clase calcula el porcentaje de una parte sobre el total.
 * Puede ser extendida para agregar más métodos relacionados con porcentajes.
 */
public final class Porcentaje {

    private static final int CIEN = 100;

    /**
     * Calcula el porcentaje de la parte sobre el total.
     *
     * @param parte el valor que representa la parte.
     * @param total el valor total.
     * @return el porcentaje que representa la parte sobre el total.
     */
    public double calcularPorcentaje(final double parte, final double total) {
        if (total == 0) {
            throw new IllegalArgumentException("El total no puede ser cero");
        }
        return (parte / total) * CIEN;
    }
}

