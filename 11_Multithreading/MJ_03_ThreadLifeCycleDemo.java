import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name; // Constructor with parameter
        System.out.println(threadName + " → NEW state (Object Created)");
    }

    public void run() {
        try {
            System.out.println(threadName + " → RUNNING state (Started execution)");

            // Thread goes into TIMED_WAITING state
            System.out.println(threadName + " → Going to sleep for 2 seconds");
            Thread.sleep(2000);

            System.out.println(threadName + " → Woke up and running again");
        } catch (InterruptedException e) {
            System.out.println(threadName + " → Interrupted");
        }

        // Thread execution finished → TERMINATED
        System.out.println(threadName + " → TERMINATED (Execution complete)");
    }
}

public class MJ_03_ThreadLifeCycleDemo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Thread Life Cycle Demo ===");

        // NEW state
        MyThread t1 = new MyThread("Thread-1");

        // RUNNABLE state
        System.out.println("Calling start(): Thread-1 → RUNNABLE");
        t1.start();

        // Main thread also sleeping for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }

}
