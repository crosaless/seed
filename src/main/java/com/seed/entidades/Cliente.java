package com.seed.entidades;

import java.util.Date;

/**
 * Esta clase representa un cliente en el sistema.
 * Incluye detalles como nombre, apellido, fecha de nacimiento, DNI, celular y correo electrónico.
 * Cada cliente tiene un número único.
 */
public final class Cliente {

    /** Número de cliente, asignado de manera incremental. */
    private int nroCliente;

    /** Nombre del cliente. */
    private String nombreCliente;

    /** Apellido del cliente. */
    private String apellidoCliente;

    /** Fecha de nacimiento del cliente. */
    private Date fechaNacimiento;

    /** DNI del cliente. */
    private long dniCliente;

    /** Número de celular del cliente. */
    private long nroCelular;

    /** Correo electrónico del cliente. */
    private String emailCliente;

    /** Contador estático que genera números de cliente únicos. */
    private static int contador = 1;

    /**
     * Constructor para la clase Cliente.
     *
     * @param nombreCliente El nombre del cliente.
     * @param apellidoCliente El apellido del cliente.
     * @param fechaNacimiento La fecha de nacimiento del cliente.
     * @param dniCliente El DNI del cliente.
     * @param nroCelular El número de celular del cliente.
     * @param emailCliente El correo electrónico del cliente.
     * @throws IllegalArgumentException Si el DNI del cliente es negativo.
     */
    public Cliente(final String nombreCliente, final String apellidoCliente, final Date fechaNacimiento,
                   final long dniCliente, final long nroCelular, final String emailCliente) {

        if (dniCliente < 0) {
            throw new IllegalArgumentException("El DNI del cliente no puede tomar un valor negativo.");
        }

        this.nroCliente = contador;
        contador++;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.dniCliente = dniCliente;
        this.nroCelular = nroCelular;
        this.emailCliente = emailCliente;
    }

    /**
     * Restablece el contador de clientes a cero.
     */
    public static void setContadorCero() {
        Cliente.contador = 1;
    }

    /**
     * Obtiene el número de cliente.
     *
     * @return El número de cliente.
     */
    public int getNroCliente() {
        return nroCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombreCliente El nuevo nombre del cliente.
     */
    public void setNombreCliente(final String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el apellido del cliente.
     *
     * @return El apellido del cliente.
     */
    public String getApellidoCliente() {
        return apellidoCliente;
    }

    /**
     * Establece el apellido del cliente.
     *
     * @param apellidoCliente El nuevo apellido del cliente.
     */
    public void setApellidoCliente(final String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     *
     * @return La fecha de nacimiento del cliente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     *
     * @param fechaNacimiento La nueva fecha de nacimiento del cliente.
     */
    public void setFechaNacimiento(final Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return El DNI del cliente.
     */
    public long getDniCliente() {
        return dniCliente;
    }

    /**
     * Establece el DNI del cliente.
     *
     * @param dniCliente El nuevo DNI del cliente.
     * @throws IllegalArgumentException Si el DNI es negativo.
     */
    public void setDniCliente(final long dniCliente) {
        if (dniCliente < 0) {
            throw new IllegalArgumentException("El DNI del cliente no puede tomar un valor negativo.");
        }
        this.dniCliente = dniCliente;
    }

    /**
     * Obtiene el número de celular del cliente.
     *
     * @return El número de celular del cliente.
     */
    public long getNroCelular() {
        return nroCelular;
    }

    /**
     * Establece el número de celular del cliente.
     *
     * @param nroCelular El nuevo número de celular del cliente.
     */
    public void setNroCelular(final long nroCelular) {
        this.nroCelular = nroCelular;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     *
     * @return El correo electrónico del cliente.
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     * Establece el correo electrónico del cliente.
     *
     * @param emailCliente El nuevo correo electrónico del cliente.
     */
    public void setEmailCliente(final String emailCliente) {
        this.emailCliente = emailCliente;
    }
}