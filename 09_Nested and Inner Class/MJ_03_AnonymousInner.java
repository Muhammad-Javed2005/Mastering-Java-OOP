import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


abstract class Greeting {
    abstract void sayHello();
}

public class MJ_03_AnonymousInner {
    public static void main(String[] args) {
        // Anonymous Inner Class implementation
        Greeting greet = new Greeting() {
            @Override
            void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greet.sayHello();
        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

