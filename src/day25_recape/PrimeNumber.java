package day25_recape;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < Number ; i++) {
            if(Number % i == 0){
                isPrime =false;
                break;
            }
        }
        if(isPrime){
            System.out.println(Number + " is prime");
        }else {
            System.out.println(Number + " is not prime");
        }
    }
}
