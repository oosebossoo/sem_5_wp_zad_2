package org.example;

// Konkretne produkty dla stylu nowoczesnego
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Siedzę na nowoczesnym krześle!");
    }
}