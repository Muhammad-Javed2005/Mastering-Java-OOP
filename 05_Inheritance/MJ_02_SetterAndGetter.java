import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;



class MyEmployee {
    private String name;
    private int id;


    public void setName(String n)
    {
        this.name = n;
    }

    public void setId(int i)
    {
        this.id = i;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

}



public class MJ_02_SetterAndGetter {


    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MyEmployee Mj = new MyEmployee();

        // This is not possible because we have not created a setter method for name 
        // Mj.name = "Muhammad Javed";
        // Mj.id = 123;


        Mj.setName("Muhammad Javed");
        Mj.setId(123);
        System.out.println("Name: " + Mj.getName());
        System.out.println("ID: " + Mj.getId());
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
