import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Example of Default Constructor vs User-defined Constructor

class Student {
    String name;
    int age;

    // Default Constructor (Java apne aap provide karta hai agar hum khud na likhen)
    Student() {
        name = "Unknown";
        age = 0;
    }

    // User-defined Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class MJ_01_ConstructorBasic{
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(); // Default Constructor
        Student s2 = new Student("Ali", 20); // User-defined Constructor

        s1.display();
        s2.display();


        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}