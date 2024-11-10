package com.inforcap.main;

public class Taxi extends Vehiculo {
    private double valorPasaje;

    // Constructor
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    // Getter y Setter para valorPasaje
    public int getValorPasaje() {
        return (int) valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int monto) {
        if (monto >= valorPasaje) {
            return (int) (monto - valorPasaje);
        } else {
            return (int)valorPasaje;
        }
    }
}