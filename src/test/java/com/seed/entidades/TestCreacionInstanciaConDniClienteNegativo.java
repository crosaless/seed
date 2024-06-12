package com.seed.entidades;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ignacio_Olcoz
 */
public class TestCreacionInstanciaConDniClienteNegativo {
    @Test
    public void testCreacionInstanciaConDniClienteNegativo(){
        //Se verifica que no se pueda crear instancias de tipo Cliente con dniCliente con valor negativo.
        //Arrange
        String nombreCliente = "Juan";
        String apellidoCliente = "Pérez";
        Date fechaNacimiento = new Date(1990, 5, 15); // 15 de junio de 1990
        long dniCliente = -12345678; // DNI negativo
        long nroCelular = 123456789;
        String emailCliente = "juan.perez@example.com";
        
        //Act y Assert
        assertThrows(IllegalArgumentException.class, () ->{
            new Cliente(nombreCliente, apellidoCliente, fechaNacimiento, dniCliente, nroCelular, emailCliente);
        }); 
        Cliente.setContadorCero();

    }
}
