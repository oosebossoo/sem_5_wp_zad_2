package org.example;

// Konkretne produkty
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Jadę samochodem!");
    }
}