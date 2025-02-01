package org.example;

// Klasa abstrakcyjna fabryki
abstract class VehicleFactory {
    // Metoda fabrykująca
    public abstract Vehicle createVehicle();

    // Metoda wykorzystująca produkt
    public void useVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}