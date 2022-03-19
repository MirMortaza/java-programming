package day23_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int secretnumber = 80;

        int guess;
         do{
             System.out.println("Guess the number from 1 -100");
             guess = input.nextInt();
             if(guess > secretnumber){
                 System.out.println(guess+ " is too high");
             } else if(guess < secretnumber){
                 System.out.println(guess+ " is too low");
             }
         }while (guess != secretnumber);

        System.out.println("you guessed correct");

    }
}
