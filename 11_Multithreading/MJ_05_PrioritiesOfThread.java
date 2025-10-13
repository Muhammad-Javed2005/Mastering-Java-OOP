import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + getName() + " | Priority: " + getPriority());
    }
}


public class MJ_05_PrioritiesOfThread {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MyThread t1 = new MyThread("Thread-Javed");
        MyThread t2 = new MyThread("Thread-Zunaira");
        MyThread t3 = new MyThread("Thread-Anus");
        MyThread t4 = new MyThread("Thread-Nabila");
        MyThread t5 = new MyThread("Thread-Mehwish");

        // Set priorities (1 to 10)
        t1.setPriority(Thread.MAX_PRIORITY);    // 10
        t2.setPriority(Thread.MIN_PRIORITY);    // 1
        t3.setPriority(7);
        t4.setPriority(3);
        t5.setPriority(Thread.NORM_PRIORITY);   // 5 (default)

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
