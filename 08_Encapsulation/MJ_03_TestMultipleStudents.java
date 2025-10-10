import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_03_TestMultipleStudents {
    public static void main(String[] args) {
        // Create multiple student objects
        MJ_01_Student s1 = new MJ_01_Student("Ali", 20, "CS");
        MJ_01_Student s2 = new MJ_01_Student("Ahmed", 21, "IT");
        MJ_01_Student s3 = new MJ_01_Student("Sara", 22, "SE");

        // Store in an array
        MJ_01_Student[] students = {s1, s2, s3};

        // Loop through array
        for(MJ_01_Student s : students) {
            s.displayInfo();
            System.out.println("-----------------");
        }
    }
}

