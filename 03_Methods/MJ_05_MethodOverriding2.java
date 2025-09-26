import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Animal {
    Animal getAnimal() {
        return this;
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() { // Covariant return type
        return this;
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}

public class MJ_05_MethodOverriding2 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Animal a = new Dog();
        a.sound();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}