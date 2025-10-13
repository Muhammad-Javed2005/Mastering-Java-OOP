import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class MyThreadRunnable1 implements Runnable {
    
        public void run() {
        while (true) {
            System.out.println("Hi, I am Muhammad Javed");
            System.out.println("I am a Data Scientist....");
        }
        
    }
}

class MyThreadRunnable2 implements Runnable {
   
    @Override
    public void run() {
        while (true) {
            System.out.println("Hi, I am Zunaira");
            System.out.println("I am a Cyber Security specialist.");
        }
    }

}


public class MJ_02_MultiThreadingByImplement {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
