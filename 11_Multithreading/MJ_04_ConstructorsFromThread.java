import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class MyTh extends Thread {
    public MyTh(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hi, I am Muhammad Javed");
        System.out.println("I am a Data Scientist....");
    }
}

class MyTh1 extends Thread 
{
    public MyTh1(String namer)
    {
        super(namer);
    }

    public void run()
    {
        System.out.println("Hi, I am Zunaira");
        System.out.println("I am a Cyber Security specialist.");
    }
}


public class MJ_04_ConstructorsFromThread {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MyTh t1 = new MyTh("Javed");
        MyTh1 t2 = new MyTh1("Zunaira");
        t1.start();
        t2.start();
        System.out.println("The id of Thread t is " + t1.getId());
        System.out.println("The id of Thread t1 is " + t2.getId());
        System.out.println("The name of Thread t is " + t1.getName());
        System.out.println("The name of Thread t1 is " + t2.getName());


        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
