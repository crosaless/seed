package com.seed.entidades;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ignacio_Olcoz
 */
public class TestIncrementoNroCliente {
    @Test
    public void testIncrementoNroCliente() {
        //Verificación de que los id o numeración de clientes se asignen correctamente al crear instancias.
        //Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Date fechaNacimiento = new Date(1990, 5, 15); // 15 de junio de 1990
        long dniCliente = 12345678;
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";
        
        String nombreCliente2 = "Ana";
        String apellidoCliente2 = "García";
        Date fechaNacimiento2 = new Date(1993, 3, 20); // 20 de marzo de 1993
        long dniCliente2 = 87654321;
        long nroCelular2 = 987654321;
        String emailCliente2 = "ana.garcia@example.com";
        
        //Act
        Cliente cliente1 = new Cliente(nombreCliente, apellidoCliente, fechaNacimiento, dniCliente, nroCelular, emailCliente);
        Cliente cliente2 = new Cliente(nombreCliente2, apellidoCliente2, fechaNacimiento2, dniCliente2, nroCelular2, emailCliente2);
        int nroCliente1 = cliente1.getNroCliente();
        int nroCliente2 = cliente2.getNroCliente();
        Cliente.setContadorCero();

        
        //Assert
        assertEquals(1, nroCliente1);
        assertEquals(2, nroCliente2);
    }
}
