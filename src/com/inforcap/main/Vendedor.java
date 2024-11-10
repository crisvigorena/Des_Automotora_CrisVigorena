package com.inforcap.main;

public class Vendedor extends Persona {
    private String direccion;

    // Constructor
    public Vendedor(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }

    // Getter y Setter para dirección
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}