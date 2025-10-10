
import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_05_EncapsulationWithArrayList {
    public static void main(String[] args) {
        // ArrayList of students
        ArrayList<MJ_01_Student> studentList = new ArrayList<>();

        // Add students
        studentList.add(new MJ_01_Student("Adeel", 23, "AI"));
        studentList.add(new MJ_01_Student("Hamza", 24, "ML"));
        studentList.add(new MJ_01_Student("Mona", 21, "Cyber Security"));

        // Print all students
        for(MJ_01_Student s : studentList) {
            s.displayInfo();
            System.out.println("-----------------");
        }

        // Update a student
        System.out.println("Updating Mona's course...");
        studentList.get(2).setCourse("Cloud Computing");
        studentList.get(2).displayInfo();
    }
}
