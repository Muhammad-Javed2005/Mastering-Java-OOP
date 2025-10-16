import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


class Person {
    String name = "Default Person";

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }

    void displayInfo() {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    String name = "Default Student";

    Student(String studentName, String personName) {
        super(personName); // call parent constructor
        this.name = studentName;
    }

    @Override
    void displayInfo() {
        System.out.println("Student: " + name);
        super.displayInfo(); // call parent method
    }

    void showNames() {
        System.out.println("Student name: " + name);
        System.out.println("Person name using super: " + super.name);
    }
}

public class MJ_04_SuperPracticalExample {
    public static void main(String[] args) {
        Student s = new Student("Ali", "Mr. Ahmed");
        s.displayInfo();
        s.showNames();

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}
