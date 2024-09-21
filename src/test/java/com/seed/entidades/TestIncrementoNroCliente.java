package com.seed.entidades;

import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test class to verify that client numbers are assigned correctly when creating instances.
 */
public class TestIncrementoNroCliente {
    @Test
    public void testIncrementoNroCliente() {
        // Verificación de que los id o numeración de clientes se asignen correctamente al crear instancias.
        // Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1990, Calendar.JUNE, 15); // 15 de junio de 1990
        long dniCliente = 12345678;
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";

        String nombreCliente2 = "Ana";
        String apellidoCliente2 = "García";
        Calendar fechaNacimiento2 = Calendar.getInstance();
        fechaNacimiento2.set(1993, Calendar.MARCH, 20); // 20 de marzo de 1993
        long dniCliente2 = 87654321;
        long nroCelular2 = 987654321;
        String emailCliente2 = "ana.garcia@example.com";

        // Act
        Cliente cliente1 = new Cliente(nombreCliente, apellidoCliente, fechaNacimiento, dniCliente, nroCelular, emailCliente);
        Cliente cliente2 = new Cliente(nombreCliente2, apellidoCliente2, fechaNacimiento2, dniCliente2, nroCelular2, emailCliente2);
        int nroCliente1 = cliente1.getNroCliente();
        int nroCliente2 = cliente2.getNroCliente();
        Cliente.setContadorCero();

        // Assert
        assertEquals(1, nroCliente1);
        assertEquals(2, nroCliente2);
    }
}