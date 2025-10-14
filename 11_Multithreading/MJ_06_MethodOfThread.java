import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");

        try {
            // Sleep for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }

        System.out.println(getName() + " finished.");
    }
}


public class MJ_06_MethodOfThread {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

         MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        // Start both threads
        t1.start();
        t2.start();

        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads finished. Main thread ends.");

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
