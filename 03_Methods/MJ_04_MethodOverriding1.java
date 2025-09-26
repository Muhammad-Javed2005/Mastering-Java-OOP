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
    @Override
    void show() {
        System.out.println("Child class method");
    }

}

public class MJ_04_MethodOverriding1 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Parent p = new Child(); // Runtime polymorphism
        p.show();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
