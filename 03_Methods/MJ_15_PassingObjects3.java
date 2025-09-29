import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Passing objects and showing reference effect
class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}

public class MJ_15_PassingObjects3 {

    void change(Data d) {
        d.value = d.value * 2;
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Data d1 = new Data(7);
        new MJ_15_PassingObjects3().change(d1);
        System.out.println("Value: " + d1.value); // 14

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
