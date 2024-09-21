package com.seed.entidades;

/**
 * Clase de servicio para gestionar entidades Cliente.
 * Esta clase proporciona métodos para agregar, obtener y eliminar clientes.
 */
public class ClienteService {

    private ClienteRepository clienteRepository;

    /**
     * Constructor para ClienteService.
     *
     * @param clienteRepository el repositorio a ser usado para las operaciones de cliente
     */
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    /**
     * Agrega un cliente si no existe ya.
     *
     * @param cliente el cliente a ser agregado
     * @throws IllegalArgumentException si el cliente ya existe
     */
    public void agregarCliente(Cliente cliente) {
        if (!clienteRepository.existeCliente(cliente.getNroCliente())) {
            clienteRepository.agregarCliente(cliente);
        } else {
            throw new IllegalArgumentException("El cliente ya existe");
        }
    }

    /**
     * Obtiene un cliente por su ID.
     *
     * @param nroCliente el ID del cliente a ser obtenido
     * @return el cliente con el ID especificado, o null si no se encuentra
     */
    public Cliente obtenerCliente(int nroCliente) {
        return clienteRepository.obtenerCliente(nroCliente);
    }

    /**
     * Elimina un cliente por su ID.
     *
     * @param nroCliente el ID del cliente a ser eliminado
     */
    public void eliminarCliente(int nroCliente) {
        clienteRepository.eliminarCliente(nroCliente);
    }

}