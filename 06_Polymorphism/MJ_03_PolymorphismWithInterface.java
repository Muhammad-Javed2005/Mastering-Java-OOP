import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Polymorphism using Interfaces

interface Shape {
    void draw(); // abstract method
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class MJ_03_PolymorphismWithInterface {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Shape s; // reference of interface

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
