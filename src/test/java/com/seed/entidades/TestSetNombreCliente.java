package com.seed.entidades;

import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test class to verify that the client's name can be set correctly.
 */
public class TestSetNombreCliente {
    @Test
    public void testSetNombreCliente() {
        // Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1990, Calendar.JUNE, 15); // 15 de junio de 1990
        long dniCliente = 12345678;
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";

        Calendar fechaNacimientoCliente = Calendar.getInstance();
        Cliente cliente = new Cliente("Juan", "Pérez", fechaNacimientoCliente, 40123567L, 2611234567L, "juan.perez@example.com");

        // Act
        cliente.setNombreCliente("Pedro");
        String nombreClienteObtenido = cliente.getNombreCliente();
        Cliente.setContadorCero();

        // Assert
        assertEquals("Pedro", nombreClienteObtenido);
    }
}