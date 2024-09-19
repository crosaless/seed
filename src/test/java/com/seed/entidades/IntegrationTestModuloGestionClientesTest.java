package com.seed.entidades;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IntegrationTestModuloGestionClientesTest {
    // Pruebas de integración para el módulo de gestión de clientes

    @Test
    public void testGestionClientes() {
        // Arrange
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteService clienteService = new ClienteService(clienteRepository);
        ModuloGestionClientes moduloGestionClientes = new ModuloGestionClientes(clienteService);

        String nombreCliente = "Juan";
        String apellidoCliente = "Perez";
        Date fechaNacimiento = new Date(1990, Calendar.JUNE, 15); // 15 de junio de 1990
        int dniCliente = 12345678;
        int nroCelular = 123456789;
        String emailCliente = "JuanPerez@fake.com";


        // Act 1
        // Crear un cliente
        moduloGestionClientes.agregarCliente(nombreCliente, apellidoCliente, fechaNacimiento, dniCliente, nroCelular, emailCliente);
        Cliente clienteAgregado = moduloGestionClientes.obtenerCliente(1);

        // Assert 1
        //Verificamos que el cliente se haya agregado correctamente.
        assertNotNull(clienteAgregado);
        assertEquals(nombreCliente, clienteAgregado.getNombreCliente());

        // Act 2
        // Eliminar el cliente
        moduloGestionClientes.eliminarCliente(1);

        // Assert 2
        // Verificamos que el cliente se haya eliminado correctamente.
        Cliente clienteEliminado = moduloGestionClientes.obtenerCliente(1);
        assertEquals(null, clienteEliminado);

    }

}
