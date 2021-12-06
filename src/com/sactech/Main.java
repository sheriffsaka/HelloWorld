package com.sactech;

import java.util.*;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = 1 + (int)(100 * Math.random());
       //Given N trials.
        int N = 5;
        int i, guess;
        System.out.println("A number will be entered between 1 and 100. Guess the number"
        + "within 5 trials.");
        //Iterate over 5 trials.
        for(i = 0; i < N; i++) {
            System.out.println("Guess the number: ");
            //Take input from the player.
            guess = sc.nextInt();
            //If number guessed correctly.
            if(number == guess){
                System.out.println("Good! You got it right");
                break;
            }
            else if (number > guess && i != N - 1){
                System.out.println("The number is greater than " + guess);
            }
            else if(number < guess && i != N - 1){
                System.out.println("The number is less than " + guess);
            }
        }
        if (i == N){
            System.out.println("You have exhausted " + N + " trial.");
            System.out.println("The number was " + number);
        }
    }
}
