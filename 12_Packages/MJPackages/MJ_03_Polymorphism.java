package MJPackages;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



// Parent Class
class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

// Child Classes
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle ⭕");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle ▭");
    }
}

public class MJ_03_Polymorphism {
    public void demo() {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("Polymorphism → Same method, different behavior:");
        s1.draw();
        s2.draw();
    }
}

