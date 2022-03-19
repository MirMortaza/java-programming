package day25_recape;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine().toLowerCase();
        String cameCase =str.substring(0,1) ;
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i -1) ==' '){
               cameCase  +=str.substring(i);
            }
        }
    }
}
