import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) { // wait if data already produced
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify(); // notify consumer
    }

    public synchronized void consume() {
        while (!available) { // wait if no data
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // notify producer
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MJ_08_InterThreadCommunicationDemo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
