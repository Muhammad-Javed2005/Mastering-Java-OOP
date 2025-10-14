import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class BackgroundTask extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running in background...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MJ_09_DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        BackgroundTask daemon = new BackgroundTask();
        daemon.setDaemon(true); // mark as daemon thread
        daemon.start();

        // main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread working: " + i);
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Main thread finished. JVM exits, daemon also stops.");

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
