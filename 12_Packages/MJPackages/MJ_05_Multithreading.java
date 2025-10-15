package MJPackages;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



// Thread by extending Thread class
class Task1 extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Task1 → Count: " + i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

// Thread by implementing Runnable interface
class Task2 implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Task2 → Count: " + i);
            try { Thread.sleep(700); } catch(Exception e) {}
        }
    }
}

public class MJ_05_Multithreading {
    public void demo() {
        System.out.println("Multithreading → Running multiple tasks in parallel:");
        Task1 t1 = new Task1();
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
