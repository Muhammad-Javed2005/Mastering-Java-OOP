package MJPackages;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



// Encapsulation Example
public class MJ_01_Encapsulation {
    private String studentName;
    private int studentAge;

    // Getter and Setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if(studentAge > 0) {
            this.studentAge = studentAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Display info
    public void display() {
        System.out.println("Encapsulation → Name: " + studentName + ", Age: " + studentAge);
    }
}

