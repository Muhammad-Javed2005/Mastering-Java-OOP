import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
        this.show(); // calls Parent's method using 'this'
    }

}

public class MJ_06_ThisInInheritance {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Child obj = new Child();
        obj.display();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}