package org.example.lesson3;

public class Counter {
    private int count = 0;

    public synchronized int getCount() {
        return count;
    }

    public synchronized int increment() {
        count++;
        return count;
    }
}
