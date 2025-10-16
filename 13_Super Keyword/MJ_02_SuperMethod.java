import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



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

    void showSound() {
        sound();         // calls current class method
        super.sound();   // calls parent class method
    }
}

public class MJ_02_SuperMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showSound();

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

