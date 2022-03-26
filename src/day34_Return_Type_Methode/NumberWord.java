package day34_Return_Type_Methode;

import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));
    }

    public static String numberAsWord (int num){

        if(num < 1 || num > 10){
            return num + " is an invalid number";
        }
        String [] words={"one","two","three","four","five","six","seven","eight","nine","ten"};

       return words[num - 1]; //-1 will convert the number to an index

    }
}
