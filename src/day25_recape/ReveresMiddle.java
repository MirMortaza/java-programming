package day25_recape;

import java.util.Scanner;

public class ReveresMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim();
         int firstSpace = str.indexOf(" ");
         int lastSpace = str.lastIndexOf(" ");

         String MiddleWord = str.substring(firstSpace + 1, lastSpace);
         String revers = "";

        for (int i = MiddleWord.length() -1; i >= 0; i--) {
            revers += MiddleWord.charAt(i);
        }
        System.out.println(str.substring(0,firstSpace +1)+ revers + str.substring(lastSpace));
    }
}
