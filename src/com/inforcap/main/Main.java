package com.inforcap.main;

public class Main {
    public static void main(String[] args) {

        Taxi taxi = new Taxi("Negro/Amarillo", "CH2231", 2000);
        int valorPasaje = 2000;
        int montoIngresado = 2500;
        int vuelto = taxi.pagarPasaje(montoIngresado);

        System.out.println("Pasajero 1 cancela " + montoIngresado + " para pagar el pasaje de " + valorPasaje + " su vuelto es de: " + vuelto);

        System.out.println("-------------------------------------------------------");

        int montoIngresado2 = 1500;
        vuelto = taxi.pagarPasaje(montoIngresado);

        System.out.println("Pasajero 2 cancela " + montoIngresado2);
        System.out.println("Monto cancelado por el pasaje no es suficiente, el valor del pasaje es de: " + valorPasaje);;
        System.out.println("Se le retornan los " + montoIngresado2 + " Favor cancele los " + valorPasaje + " que es el valor del pasaje");


        System.out.println("*********************************************************");


        Bus bus = new Bus("Amarillo", "NL9901", 40);
        System.out.println("Asientos disponibles en el Bus: " + bus.asientosDisponibles());


        System.out.println("----------------------------------------------------------");

        Minibus minibus = new Minibus("Blanco", "GHI789", 20, "Urbano");
        System.out.println("Atributos del Minibus:");
        minibus.imprimeBus();


        System.out.println("-------------------------------------------------------------");

        Vendedor vendedor = new Vendedor("12345678-9", "Juan Pérez", 35, "Av. Siempre Viva 742");


        Tienda tienda = new Tienda(vendedor, taxi, 50);
        System.out.println(tienda.existeStock());
    }
}