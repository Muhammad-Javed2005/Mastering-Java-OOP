import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

class Game {
    public int number;
    public int inputNumber;
    public int guessCount = 0;

    public void setGuessCount(int i) {
        this.guessCount = i;
    }

    public int getGuessCount() {
        return guessCount;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
        this.inputNumber = scanner.nextInt();
    }

    boolean isCorrectNumber()
    {
        guessCount++;
        if (number == inputNumber)
        {
            System.out.format("Yes you guess its right , it was %d\n You guess in it %d attempts  ", number,
                    guessCount);
            return true;
        } 
        else if (inputNumber < number)
        {
            System.out.println("Your guess is too low");
        }

        else if (inputNumber > number)
        {
            System.out.println("Your guess is too high");
        }

        return false;
    }
}

public class MJ_PracticeSet_02 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        // Scanner sc = new Scanner(System.in);

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            // System.out.println(b);

        }

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
