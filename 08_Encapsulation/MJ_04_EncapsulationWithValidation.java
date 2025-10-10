import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_04_EncapsulationWithValidation {
    public static void main(String[] args) {
        MJ_01_Student s1 = new MJ_01_Student("", -10, ""); // Invalid values
        s1.displayInfo();

        System.out.println("\nCorrecting values...");
        s1.setName("Bilal");
        s1.setAge(25);
        s1.setCourse("Data Science");

        s1.displayInfo();
    }
}
