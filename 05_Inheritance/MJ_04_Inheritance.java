import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class base {
    public int x;

    public void setX(int x) {
        System.out.println("I ama in base and setting x now...");
        this.x = x;
    }

    public int getX() {

        return this.x;
    }

}


class Derived extends base 
{
    public int y;

    public void sety(int y) {
        System.out.println("I ama in base and setting x now...");
        this.y = y;
    }

    public int gety() {

        return this.y;
    }  
}


public class MJ_04_Inheritance {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        base b = new base();
        Derived d = new Derived();

        b.setX(45);
        d.setX(34);


        System.out.println("Value of x is: " + b.getX());
        System.out.println("Value of y is: " + d.getX());


        d.sety(30);
        System.out.println("Value of y is: " + d.gety());

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}

