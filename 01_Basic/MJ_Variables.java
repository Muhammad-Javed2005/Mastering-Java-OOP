import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_Variables {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        // Variable declaration and initialization
        int age = 21;              // integer variable
        double salary = 55000.50;  // decimal variable
        char grade = 'A';          // single character
        boolean isStudent = true;  // boolean type
        String name = "Javed";     // string object

        // Printing values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student? " + isStudent);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}