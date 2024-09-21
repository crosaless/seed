package com.seed.entidades;

import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Test class to verify that instances of Cliente cannot be created with a negative dniCliente.
 */
public class TestCreacionInstanciaConDniClienteNegativo {
    @Test
    public void testCreacionInstanciaConDniClienteNegativo() {
        // Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1990, Calendar.JUNE, 15); // 15 de junio de 1990
        long dniCliente = -12345678; // DNI negativo
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(nombreCliente, apellidoCliente, fechaNacimiento, dniCliente, nroCelular, emailCliente);
        });
        Cliente.setContadorCero();
    }
}