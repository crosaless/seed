package com.seed.entidades;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase repositorio para gestionar entidades Cliente.
 * Esta clase simula una base de datos usando un HashMap.
 */
public class ClienteRepository {

    private Map<Integer, Cliente> baseDatosClientes = new HashMap<>();

    /**
     * Agrega un cliente a la base de datos simulada.
     *
     * @param cliente el cliente a ser agregado
     */
    public void agregarCliente(Cliente cliente) {
        baseDatosClientes.put(cliente.getNroCliente(), cliente);
    }

    /**
     * Obtiene un cliente de la base de datos simulada por su ID.
     *
     * @param nroCliente el ID del cliente a ser obtenido
     * @return el cliente con el ID especificado, o null si no se encuentra
     */
    public Cliente obtenerCliente(int nroCliente) {
        return baseDatosClientes.get(nroCliente);
    }

    /**
     * Elimina un cliente de la base de datos simulada por su ID.
     *
     * @param nroCliente el ID del cliente a ser eliminado
     */
    public void eliminarCliente(int nroCliente) {
        baseDatosClientes.remove(nroCliente);
    }

    /**
     * Verifica si un cliente existe en la base de datos simulada por su ID.
     *
     * @param nroCliente el ID del cliente a verificar
     * @return true si el cliente existe, false en caso contrario
     */
    public boolean existeCliente(int nroCliente) {
        return baseDatosClientes.containsKey(nroCliente);
    }

}