import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Example of Runtime Polymorphism (Method Overriding)

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MJ_02_RuntimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Animal a; // reference of Animal

        a = new Dog(); // Dog object
        a.sound();

        a = new Cat(); // Cat object
        a.sound();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
