import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Outer {
    private String message = "Hello from Outer Class!";

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Inner class accessing: " + message);
        }
    }
}

public class MJ_01_MemberInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}
