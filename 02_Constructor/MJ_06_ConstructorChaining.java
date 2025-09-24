import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Demonstrates this() and super() constructor chaining

class Person {
    String name;

    // Parent constructor
    Person(String n) {
        name = n;
        System.out.println("Person Constructor: " + name);
    }
}

class Employee extends Person {
    int salary;

    // Constructor chaining using super()
    Employee(String n, int s) {
        super(n); // calls parent constructor
        salary = s;
        System.out.println("Employee Constructor: Salary = " + salary);
    }
}

class ChainingExample {
    int x, y;

    // Constructor 1
    ChainingExample() {
        this(10, 20); // calling another constructor of same class
        System.out.println("Default Constructor executed");
    }

    // Constructor 2
    ChainingExample(int a, int b) {
        x = a;
        y = b;
        System.out.println("Parameterized Constructor: x=" + x + " y=" + y);
    }
}

public class MJ_06_ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Super() Example ----");
        Employee e = new Employee("Javed", 50000);

        System.out.println("\n---- this() Example ----");
        ChainingExample c = new ChainingExample();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
