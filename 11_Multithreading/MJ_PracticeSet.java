import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class A extends Thread 
{
    public void run()
    {
        while (true) 
        {
            try
            {
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class B extends Thread 
{
    public void run() 
    {
        while (true)
        {
            try
            {
                Thread.sleep(250);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class MJ_PracticeSet {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        
        A a = new A();
        B b = new B();
        a.start();
        b.start();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
