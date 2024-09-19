package com.seed.entidades;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ignacio_Olcoz
 */
public class TestObtenerNroCliente {
    @Test
    public void testGetNroCliente() {
        // Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Date fechaNacimiento = new Date(1990, 5, 15); // 15 de junio de 1990
        long dniCliente = 12345678;
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";

        Cliente cliente = new Cliente("Juan", "Pérez", new Date(), 40123567L, 2611234567L, "juan.perez@example.com");

        // Act
        int nroClienteObtenido = cliente.getNroCliente();
        Cliente.setContadorCero();
        // Assert
        assertEquals(1, nroClienteObtenido);

    }
}
