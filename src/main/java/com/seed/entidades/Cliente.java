package com.seed.entidades;

import java.util.Date;

/**
 * Esta clase representa un cliente en el sistema.
 * Incluye detalles como nombre, apellido, fecha de nacimiento, DNI,
 * celular y correo electrónico. Cada cliente tiene un número único.
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
     * @param nombre El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param fechaNac La fecha de nacimiento del cliente.
     * @param dni El DNI del cliente.
     * @param celular El número de celular del cliente.
     * @param email El correo electrónico del cliente.
     * 
     * @throws IllegalArgumentException
     *             Si el DNI del cliente es negativo.
     */
    public Cliente(final String nombre, final String apellido,
                   final Date fechaNac,
                   final long dni, final long celular,
                   final String email) {

        if (dni < 0) {
            throw new IllegalArgumentException("El DNI del cliente no "
                    +
                    "puede tomar un valor negativo.");
        }

        this.nroCliente = contador++;
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.fechaNacimiento = fechaNac;
        this.dniCliente = dni;
        this.nroCelular = celular;
        this.emailCliente = email;
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
     * @param nombre
     *            El nuevo nombre del cliente.
     */
    public void setNombreCliente(final String nombre) {
        this.nombreCliente = nombre;
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
     * @param apellido
     *            El nuevo apellido del cliente.
     */
    public void setApellidoCliente(final String apellido) {
        this.apellidoCliente = apellido;
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
     * @param fechaNac
     *            La nueva fecha de nacimiento del cliente.
     */
    public void setFechaNacimiento(final Date fechaNac) {
        this.fechaNacimiento = fechaNac;
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
     * @param dni El nuevo DNI del cliente.
     * 
     * @throws IllegalArgumentException Si el DNI es negativo.
     */
    public void setDniCliente(final long dni) {
        if (dni < 0) {
            throw new IllegalArgumentException("El DNI del cliente no "
                    +
                    "puede tomar un valor negativo.");
        }
        this.dniCliente = dni;
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
     * @param celular
     *            El nuevo número de celular del cliente.
     */
    public void setNroCelular(final long celular) {
        this.nroCelular = celular;
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
     * @param email
     *            El nuevo correo electrónico del cliente.
     */
    public void setEmailCliente(final String email) {
        this.emailCliente = email;
    }
}
