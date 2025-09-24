import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Singleton {
    private static Singleton instance;

    // Private Constructor
    private Singleton() {
        System.out.println("Private Constructor Called!");
    }

    // Static method to get single object
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void showMessage() {
        System.out.println("Hello, I am a Singleton instance.");
    }
}


public class MJ_04_PrivateConstructor {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        // Singleton obj = new Singleton();  Not allowed, constructor is private
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        System.out.println("Are both objects same? " + (s1 == s2)); // true
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
