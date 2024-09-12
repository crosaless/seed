package com.seed.entidades;

/**
 * Clase que representa un producto.
 */
final class Producto {

    /**
     * Stock del producto.
     */
    private int stock = INITIAL_STOCK;

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Stock inicial.
     */
    private static final int INITIAL_STOCK = 60;

    /**
     * Disminuye el stock del producto.
     *
     * @param cantidad Cantidad a disminuir.
     * @return Stock actualizado.
     */
    public int disminuir(final int cantidad) {
        stock = stock - cantidad;
        return stock;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre Nombre del producto.
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el stock actual del producto.
     *
     * @return El stock actual.
     */
    public int getStock() {
        return stock;
    }
}
