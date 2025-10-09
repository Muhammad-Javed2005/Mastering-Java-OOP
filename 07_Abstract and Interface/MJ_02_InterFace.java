import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

// Shape interface
interface Shape {
   
    double area();
    double perimeter();
    String getName();
    void displayShapeInfo();
}

class Circle implements Shape {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String getName() {
        return "Circle";
    }

    public void displayShapeInfo() {
        System.out.println("Shape: " + getName());
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("--------------------------");
    }
}

class Rectangle implements Shape {
    private String color;
    private double length, width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String getName() {
        return "Rectangle";
    }

    public void displayShapeInfo() {
        System.out.println("Shape: " + getName());
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("--------------------------");
    }
}

class Rhombus implements Shape {
    private String color;
    private double diagonal1, diagonal2, side;

    public Rhombus(String color, double d1, double d2, double side) {
        this.color = color;
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }

    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String getName() {
        return "Rhombus";
    }

    public void displayShapeInfo() {
        System.out.println("Shape: " + getName());
        System.out.println("Color: " + color);
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Side: " + side);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("--------------------------");
    }
}

public class MJ_02_InterFace {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        // All method in interface class only create all public method..
        // You can create properties in interface
        // You can not modify properties in interface as they are final..
        
        Shape c = new Circle("Red", 5);
        Shape r = new Rectangle("Blue", 4, 6);
        Shape rh = new Rhombus("Green", 8, 6, 5);

        c.displayShapeInfo();
        r.displayShapeInfo();
        rh.displayShapeInfo();
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
