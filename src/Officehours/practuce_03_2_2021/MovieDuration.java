package Officehours.practuce_03_2_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("next the lenght of the movie");
        double movielenght = input.nextDouble();
        double price = 0;
        
        if (movielenght == 1){
            price = 8.99;
            System.out.println("price = " + price);
        }
        if (movielenght ==1.5){
            price= 10.50;
            System.out.println("price: " + 8.99);

            if (movielenght==2.0){
                price=12.99;
                System.out.println("price = " + price);
                
                if (movielenght==2.5) {
                    System.out.println("price = " + price);
                }
            }
           

        }
    }
}
