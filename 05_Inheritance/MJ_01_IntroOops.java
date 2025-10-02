import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class Employee {
    // Fields (Encapsulated)
    private int id;
    private String name;
    private int rollNo;
    private int salary;


    // Constructor (Optional)
    public Employee() {
        // Empty constructor for flexibility
    }


    // Method to set info (using Scanner input)
    public void setInfo(Scanner sc) {
        System.out.print("Enter Employee Name      : ");
        this.name = sc.nextLine();
        System.out.print("Enter Employee ID        : ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee Roll No   : ");
        this.rollNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee Salary    : ");
        this.salary = Integer.parseInt(sc.nextLine());
        System.out.println("-----------------------------------");
    }


    // Method to get/display employee info
    public void getInfo() {
        System.out.println("Name         : " + name);
        System.out.println("Employee ID  : " + id);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Salary       : " + salary);
        System.out.println("Bonus        : " + calculateBonus());
        System.out.println("Total Pay    : " + (salary + calculateBonus()));
        System.out.println("-----------------------------------");
    }


    // Calculate bonus based on salary range
    public int calculateBonus() {
        if (salary >= 50000) {
            return 10000; // high bonus
        } else if (salary >= 30000) {
            return 5000; // medium bonus
        } else {
            return 2000; // low bonus
        }
    }
}



public class MJ_01_IntroOops {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        System.out.println("=== Employee Management System ===\n");

        // Creating two employees
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // Taking input
        System.out.println("Enter details for Employee 1:");
        emp1.setInfo(sc);

        System.out.println("Enter details for Employee 2:");
        emp2.setInfo(sc);

        // Displaying info
        System.out.println("\n=== Employee Records ===\n");
        emp1.getInfo();
        emp2.getInfo();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}

// Muhammad Javed