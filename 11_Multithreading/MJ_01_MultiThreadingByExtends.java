import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.net.Socket;
import java.util.Arrays;

class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hi, I am Muhammad Javed");
            System.out.println("I am a Data Scientist....");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hi, I am Zunaira");
            System.out.println("I am a Cyber Security specialist.");
        }
    }

}

public class MJ_01_MultiThreadingByExtends {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}

