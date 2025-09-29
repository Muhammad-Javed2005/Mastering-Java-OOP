import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Passing objects to methods
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class MJ_13_PassingObjects1 {

    void printStudent(Student s) {
        System.out.println("Student name: " + s.name);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Student st = new Student("Alice");
        new MJ_13_PassingObjects1().printStudent(st);
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}