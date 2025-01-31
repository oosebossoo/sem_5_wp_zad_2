package org.example;

public class Main {
    // Liczba filozofów i widelców
    private static final int NUM_PHILOSOPHERS = 5;

    // Tablica widelców (każdy widelec to obiekt do synchronizacji)
    private static final Object[] forks = new Object[NUM_PHILOSOPHERS];

    // Inicjalizacja widelców
    static {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Object();
        }
    }

    // Klasa reprezentująca filozofa
    static class Philosopher implements Runnable {
        private int id;

        public Philosopher(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    think();
                    eat();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Symulacja myślenia
        private void think() throws InterruptedException {
            System.out.println("Filozof " + id + " myśli.");
            Thread.sleep((long) (Math.random() * 1000));
        }

        // Symulacja jedzenia
        private void eat() throws InterruptedException {
            // Ustalanie kolejności podnoszenia widelców, aby uniknąć zakleszczenia
            Object firstFork = forks[id];
            Object secondFork = forks[(id + 1) % NUM_PHILOSOPHERS];

            // Jeśli filozof ma nieparzysty numer, najpierw bierze lewy widelec, potem prawy
            // Jeśli filozof ma parzysty numer, najpierw bierze prawy widelec, potem lewy
            if (id % 2 == 0) {
                synchronized (firstFork) {
                    synchronized (secondFork) {
                        System.out.println("Filozof " + id + " je.");
                        Thread.sleep((long) (Math.random() * 1000));
                    }
                }
            } else {
                synchronized (secondFork) {
                    synchronized (firstFork) {
                        System.out.println("Filozof " + id + " je.");
                        Thread.sleep((long) (Math.random() * 1000));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Tworzenie i uruchamianie wątków filozofów
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            new Thread(new Philosopher(i)).start();
        }
    }
}