package org.example.lesson3;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Object lock = new Object();

        // Create two instances of the Increment class
        Increment increment1 = new Increment(counter, lock);
        Increment increment2 = new Increment(counter, lock);

        // Create two instances of the Thread class and start them
        Thread thread1 = new Thread(increment1);
        Thread thread2 = new Thread(increment2);
        thread1.start();
        thread2.start();
    }
}
