package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int Max = 0;
        int Min = 0;

        int n =0;
        while(n < 5){
             n++;
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > Max){
                Max= number;

            }
            if(number< Min){
                Min = number;
            }
        }
        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);

    }
}
