package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        System.out.print("Welcome to the random number guessing game!");
        System.out.println("Please enter a number 0 to 9");
        int Humannumber = input.nextInt();
        int randomnumber1 = (random.nextInt(10));
        if (Humannumber == randomnumber1) {
            System.out.print("you guessed right! The correct number was " + randomnumber1);
        }
        while (Humannumber != randomnumber1) {
            System.out.print("Please try again!");
            int atempt2 = input.nextInt();
            if (atempt2 == randomnumber1) {
                System.out.print("you guessed right! Try the game again to get the right answer first try!!");
            }
        }
    }
    }
