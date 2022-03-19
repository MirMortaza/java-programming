package day25_recape;

import java.util.Scanner;

public class Multiplyed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        System.out.println("how many times do you want to repeat the word");
        int repeat = input.nextInt();

        for (int i = 0; i <repeat ; i++) {

            word+= word.charAt(word.length()-1);

        }
        System.out.println(word);

    }
}
