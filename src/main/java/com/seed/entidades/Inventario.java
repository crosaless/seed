package com.seed.entidades;

/**
 * Clase que gestiona el inventario de productos.
 */
public final class Inventario {

    /**
     * Registra una venta en el inventario.
     *
     * @param cantVendida Cantidad vendida.
     * @param cantActual Cantidad actual en inventario.
     * @return La cantidad actualizada después de la venta.
     */
    public int venta(final int cantVendida, final int cantActual) {
        return cantActual - cantVendida;
    }

    /**
     * Registra una reposición en el inventario.
     *
     * @param cantRepuesta Cantidad repuesta.
     * @param cantActual Cantidad actual en inventario.
     * @return La cantidad actualizada después de la reposición.
     */
    public int reposicion(final int cantRepuesta, final int cantActual) {
        return cantActual + cantRepuesta;
    }

    /**
     * Registra una pérdida en el inventario.
     *
     * @param cantPerdida Cantidad perdida.
     * @param cantActual Cantidad actual en inventario.
     * @return La cantidad actualizada después de la pérdida.
     */
    public int perdida(final int cantPerdida, final int cantActual) {
        return cantActual - cantPerdida;
    }
}