import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_02_Main {
    public static void main(String[] args) {
        // Create object using constructor
        MJ_01_Student s1 = new MJ_01_Student("Ali", 20, "Computer Science");

        // Display details
        s1.displayInfo();

        // Use setters to update values
        s1.setName("Javed");
        s1.setAge(22);
        s1.setCourse("Software Engineering");

        System.out.println("\nAfter updating:");
        s1.displayInfo();

        // Test validation
        s1.setAge(-5); // Will show "Invalid age!"

        
        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

