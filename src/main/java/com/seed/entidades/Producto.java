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
    private String nombreProducto;

    /**
     * Stock inicial.
     */
    private static final int INITIAL_STOCK = 60;

    /**
     * Disminuye el stock del producto.
     *
     * @param cantidad
     *            Cantidad a disminuir.
     *
     * @return Stock actualizado.
     */
    public int disminuir(final int cantidad) {
        stock = stock - cantidad;
        return stock;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nuevoNombre
     *            Nombre del producto.
     */
    public void setNombreProducto(final String nuevoNombre) {
        this.nombreProducto = nuevoNombre;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
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
