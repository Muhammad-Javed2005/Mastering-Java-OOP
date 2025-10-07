import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;
// Real-life Example of Polymorphism

class Payment {
    void pay() {
        System.out.println("Generic Payment");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class PayPal extends Payment {
    void pay() {
        System.out.println("Payment done using PayPal");
    }
}

public class MJ_05_PolymorphismRealLife {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Payment p;

        p = new CreditCard();
        p.pay();

        p = new PayPal();
        p.pay();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
