package org.example;

public class Main {
    // Prywatne statyczne pole przechowujące instancję klasy
    private static volatile Singleton instance;

    // Prywatny konstruktor, aby uniemożliwić tworzenie instancji z zewnątrz
    private Singleton() {
        // Inicjalizacja obiektu
    }

    // Publiczna metoda statyczna zwracająca instancję klasy
    public static Singleton getInstance() {
        // Pierwsze sprawdzenie (bez synchronizacji)
        if (instance == null) {
            // Synchronizacja tylko przy pierwszym tworzeniu instancji
            synchronized (Singleton.class) {
                // Drugie sprawdzenie (wewnątrz synchronizacji)
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Przykładowa metoda instancyjna
    public void doSomething() {
        System.out.println("Singleton działa!");
    }

    public static void main(String[] args) {
        // Przykład użycia
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}