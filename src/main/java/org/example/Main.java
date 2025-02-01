package org.example;

// Przykład użycia
public class Main {
    public static void main(String[] args) {
        // Tworzymy fabrykę mebli nowoczesnych
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.sitOn(); // Siedzę na nowoczesnym krześle!
        modernSofa.lieOn(); // Leżę na nowoczesnej sofie!
        modernCoffeeTable.placeCoffee(); // Stawiam kawę na nowoczesnym stoliku!

        // Tworzymy fabrykę mebli vintage
        FurnitureFactory vintageFactory = new VintageFurnitureFactory();
        Chair vintageChair = vintageFactory.createChair();
        Sofa vintageSofa = vintageFactory.createSofa();
        CoffeeTable vintageCoffeeTable = vintageFactory.createCoffeeTable();

        vintageChair.sitOn(); // Siedzę na vintage'owym krześle!
        vintageSofa.lieOn(); // Leżę na vintage'owej sofie!
        vintageCoffeeTable.placeCoffee(); // Stawiam kawę na vintage'owym stoliku!
    }
}