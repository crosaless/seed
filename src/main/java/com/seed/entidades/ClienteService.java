package com.seed.entidades;


public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Metodo para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        if (!clienteRepository.existeCliente(cliente.getNroCliente())) {
            clienteRepository.agregarCliente(cliente);
        } else {
            throw new IllegalArgumentException("El cliente ya existe");
        }
    }

    // Metodo para obtener un cliente por su ID
    public Cliente obtenerCliente(int nroCliente) {
        return clienteRepository.obtenerCliente(nroCliente);
    }

    // Metodo para eliminar un cliente por su ID
    public void eliminarCliente(int nroCliente) {
        clienteRepository.eliminarCliente(nroCliente);
    }

}
