import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Example of Compile-time Polymorphism (Method Overloading)
class Calculator {
    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MJ_01_CompileTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 int: " + calc.add(10, 20));
        System.out.println("Sum of 3 int: " + calc.add(10, 20, 30));
        System.out.println("Sum of 2 double: " + calc.add(5.5, 4.5));
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}