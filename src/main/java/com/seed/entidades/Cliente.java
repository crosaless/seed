package com.seed.entidades;

import java.util.Date;

/**
 *
 * @author Ignacio_Olcoz
 */
public class Cliente {

    private int nroCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private Date fechaNacimiento;
    private long dniCliente;
    private long nroCelular;
    private String emailCliente;
    private static int contador = 1;

    public Cliente(String nombreCliente, String apellidoCliente, Date fechaNacimiento, long dniCliente, long nroCelular, String emailCliente) {

        //Validación que el atributo dniCliente no tome un valor negativo.
        if (dniCliente < 0) {
            throw new IllegalArgumentException("El DNI del cliente no puede tomar un valor negativo.");
        }

        this.nroCliente = contador;
        contador = contador + 1;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.dniCliente = dniCliente;
        this.nroCelular = nroCelular;
        this.emailCliente = emailCliente;
    }

    public static void setContadorCero() {
        Cliente.contador = 1;
    }

    
    
    public int getNroCliente() {
        return nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        if (dniCliente < 0) {
            throw new IllegalArgumentException("El DNI del cliente no puede tomar un valor negativo.");
        }
        this.dniCliente = dniCliente;
    }

    public long getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(long nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

}
