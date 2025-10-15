import MJPackages.*;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



public class MJ_Main {
    public static void main(String[] args) {
        System.out.println("===== Java OOP Packages Demo =====");

        // Encapsulation
        MJ_01_Encapsulation enc = new MJ_01_Encapsulation();
        enc.setStudentName("Javed");
        enc.setStudentAge(22);
        enc.display();

        // Inheritance
        MJ_02_Inheritance inh = new MJ_02_Inheritance();
        inh.demo();

        // Polymorphism
        MJ_03_Polymorphism poly = new MJ_03_Polymorphism();
        poly.demo();

        // Abstraction
        MJ_04_Abstraction abs = new MJ_04_Abstraction();
        abs.demo();

        // Multithreading
        MJ_05_Multithreading mt = new MJ_05_Multithreading();
        mt.demo();

        System.out.println("===== End of Demo =====");
    }
}


