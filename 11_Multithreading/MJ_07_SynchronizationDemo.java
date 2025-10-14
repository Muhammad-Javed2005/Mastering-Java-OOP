import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Counter {
    private int count = 0;

    // synchronized method
    public synchronized void increment(String name) {
        for (int i = 1; i <= 5; i++) {
            count++;
            System.out.println(name + " incremented count to: " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Worker extends Thread {
    Counter counter;
    String workerName;

    Worker(Counter counter, String workerName) {
        this.counter = counter;
        this.workerName = workerName;
    }

    public void run() {
        counter.increment(workerName);
    }
}

public class MJ_07_SynchronizationDemo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Counter counter = new Counter();

        Worker w1 = new Worker(counter, "Worker-1");
        Worker w2 = new Worker(counter, "Worker-2");

        w1.start();
        w2.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}