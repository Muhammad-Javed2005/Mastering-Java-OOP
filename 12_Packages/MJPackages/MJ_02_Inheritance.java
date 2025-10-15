package MJPackages;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;




// Base Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived Class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks 🐶");
    }
}

// Another Derived Class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows 🐱");
    }
}

public class MJ_02_Inheritance {
    public void demo() {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        System.out.println("Inheritance → Demonstrating method overriding:");
        a1.sound();
        a2.sound();
    }
}
