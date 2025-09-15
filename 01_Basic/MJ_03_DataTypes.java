import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_03_DataTypes {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

         // Primitive data types
        byte b = 100;          // 1 byte
        short s = 32000;       // 2 bytes
        int i = 123456;        // 4 bytes
        long l = 123456789L;   // 8 bytes
        float f = 3.14f;       // 4 bytes (single precision)
        double d = 3.14159265; // 8 bytes (double precision)
        char c = 'J';          // 2 bytes (Unicode)
        boolean flag = false;  // true/false

        // Printing all
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}