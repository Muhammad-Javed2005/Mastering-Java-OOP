import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



class Parent {
    String name = "Parent Class";
}

class Child extends Parent {
    String name = "Child Class";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name using super: " + super.name);
    }
}

public class MJ_01_SuperVariable {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

