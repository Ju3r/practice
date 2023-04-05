package org.example.lesson3;

public class Increment implements Runnable {
    private final Counter counter;
    private final Object lock;

    public Increment(Counter counter, Object lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (counter.getCount() <= 100) {
            int count = counter.increment();
            System.out.println(Thread.currentThread().getName() + " " + count);
            synchronized (lock) {
                if (count == 100) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " win");
                } else if (count > 100) {
                    System.out.println(Thread.currentThread().getName() + " late");
                    lock.notify();
                }
            }
        }
    }
}