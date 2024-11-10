package com.inforcap.main;

public class Cliente extends Persona {
    private int edad;

    // Constructor
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
        this.edad = edad;
    }

    // Getter y Setter para edad
    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}