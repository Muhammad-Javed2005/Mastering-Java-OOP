import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class base {

    public int x;

    base()
    {
        System.out.println("I am a constructor of base class...");
    }

    base (int x)
    {
        System.out.println("I am overloaded Constructor of base with value of x : " + x );
    }



}


class Derived extends base {
    public int y;

    Derived() {
        System.out.println("I am a constructor of Derived class...");
    }

    Derived(int x ,int y)
    {
        super(x);
        System.out.println("I am overloaded Constructor of Derived with value of y : " + y );
    }

}

class ChildOfDervied extends Derived {
    public int z;

    ChildOfDervied() {
        System.out.println("I am a constructor of ChildOfDervied class...");
    }

    ChildOfDervied(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overloaded Constructor of ChildOfDerived with value of z : " + z);
    }
}



public class MJ_05_ConstructorInInheritance {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        // base b = new base();
        // Derived d = new Derived();
        ChildOfDervied cd = new ChildOfDervied();

        // base b = new base(34);
        // Derived d = new Derived(54,67);
        // ChildOfDervied cd = new ChildOfDervied(76,45,76);  

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
