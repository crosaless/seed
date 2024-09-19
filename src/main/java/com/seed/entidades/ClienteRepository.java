package com.seed.entidades;

import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {

    private Map<Integer, Cliente> baseDatosClientes = new HashMap<>();

    // Agrega un cliente a la base de datos simulada
    public void agregarCliente(Cliente cliente) {
        baseDatosClientes.put(cliente.getNroCliente(), cliente);
    }

    // Obtiene un cliente de la base de datos por su ID
    public Cliente obtenerCliente(int nroCliente) {
        return baseDatosClientes.get(nroCliente);
    }

    // Elimina un cliente de la base de datos por su ID
    public void eliminarCliente(int nroCliente) {
        baseDatosClientes.remove(nroCliente);
    }

    // Verifica si un cliente existe en la base de datos
    public boolean existeCliente(int nroCliente) {
        return baseDatosClientes.containsKey(nroCliente);
    }

}
