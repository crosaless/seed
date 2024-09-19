package com.seed.entidades;

import java.util.Date;

public class ModuloGestionClientes {

    private ClienteService clienteService;

    public ModuloGestionClientes(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Agrega un cliente
    public void agregarCliente(String nombre, String apellido, Date fechaNacimiento, long dni, long nroCelular, String email) {
        Cliente cliente = new Cliente(nombre, apellido, fechaNacimiento, dni, nroCelular, email);
        clienteService.agregarCliente(cliente);
    }

    // Obtiene un cliente
    public Cliente obtenerCliente(int nroCliente) {
        return clienteService.obtenerCliente(nroCliente);
    }

    // Elimina un cliente
    public void eliminarCliente(int nroCliente) {
        clienteService.eliminarCliente(nroCliente);
    }
}
