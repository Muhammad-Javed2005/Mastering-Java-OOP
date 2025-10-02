import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


class MyEmployee {
    private String name;
    private int id;
    private double salary;


    public void setName(String n)
    {
        this.name = n;
    }

    public void setId(int i)
    {
        this.id = i;
    }

    public void setSalary(double s)
    {
        this.salary = s;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public double getSalary()
    {
        return salary;
    }


    public MyEmployee()
    {
        name = "Zunaira";
        id = 123;
    }

    public MyEmployee(String n, int i, double s)
    {
        name = n;
        id = i;
        salary = s;
    }
}


public class MJ_03_Constructor {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        // MyEmployee Mj = new MyEmployee();
        MyEmployee Mj = new MyEmployee("Muhammad Javed", 041, 67000.899);

        System.out.println("Name: " + Mj.getName());
        System.out.println("ID: " + Mj.getId());
        System.out.println("Salary: " + Mj.getSalary());
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}

