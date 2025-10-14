import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Resource1 {
}

class Resource2 {
}

public class MJ_10_DeadlockDemo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        final Resource1 r1 = new Resource1();
        final Resource2 r2 = new Resource2();

        // Thread 1
        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: Locked Resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (r2) {
                        System.out.println("Thread 1: Locked Resource 2");
                    }
                }
            }
        };

        // Thread 2
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread 2: Locked Resource 2");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (r1) {
                        System.out.println("Thread 2: Locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}