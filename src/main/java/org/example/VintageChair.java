package org.example;

// Konkretne produkty dla stylu vintage
class VintageChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Siedzę na vintage'owym krześle!");
    }
}