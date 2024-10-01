package com.seed.entidades;

import java.util.Calendar;

/**
 * Clase para gestionar operaciones relacionadas con clientes.
 */
public class ModuloGestionClientes {

    private ClienteService clienteService;

    /**
     * Constructor para ModuloGestionClientes.
     *
     * @param clienteService el servicio de cliente a ser usado para las operaciones
     */
    public ModuloGestionClientes(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    /**
     * Agrega un cliente.
     *
     * @param nombre          el nombre del cliente
     * @param apellido        el apellido del cliente
     * @param fechaNacimiento la fecha de nacimiento del cliente
     * @param dni             el DNI del cliente
     * @param nroCelular      el número de celular del cliente
     * @param email           el correo electrónico del cliente
     */
    public void agregarCliente(String nombre, String apellido, Calendar fechaNacimiento, long dni, long nroCelular, String email) {
        Cliente cliente = new Cliente(nombre, apellido, fechaNacimiento, dni, nroCelular, email);
        clienteService.agregarCliente(cliente);
    }

    /**
     * Obtiene un cliente por su número de cliente.
     *
     * @param nroCliente el número de cliente
     * @return el cliente con el número especificado, o null si no se encuentra
     */
    public Cliente obtenerCliente(int nroCliente) {
        return clienteService.obtenerCliente(nroCliente);
    }

    /**
     * Elimina un cliente por su número de cliente.
     *
     * @param nroCliente el número de cliente
     */
    public void eliminarCliente(int nroCliente) {
        clienteService.eliminarCliente(nroCliente);
    }
}