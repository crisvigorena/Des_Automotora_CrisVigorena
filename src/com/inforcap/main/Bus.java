package com.inforcap.main;

public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

    // Constructor
    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Getter y Setter
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // Método asientos disponibles
    public int asientosDisponibles() {
        return cantidadDeAsientos; // Puedes ajustar la lógica según sea necesario
    }
}
