package org.example;

// Przykład użycia
public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.useVehicle(); // Jadę samochodem!

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.useVehicle(); // Jadę rowerem!
    }
}