import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Overriding with access modifier and exception handling
class Base {
    protected void display() throws RuntimeException {
        System.out.println("Base class method");
    }
}

class Derived extends Base {
    @Override
    public void display() throws ArithmeticException { // Allowed (narrower exception + wider access)
        System.out.println("Derived class method");
    }
}

public class MJ_06_MethodOverriding3 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Base obj = new Derived();
        obj.display();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
