import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_01_Student {
    // Private fields (Encapsulation)
    private String name;
    private int age;
    private String course;

    // Constructor
    public MJ_01_Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
