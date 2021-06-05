package day26_loops;

import java.util.Locale;

public class PrintChars {
    public static void main(String[] args) {
        String word = "Mir is new student";
        for(int i = 0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
        String word3="java";
        for (int i =0;i>=word3.length();i--){
            System.out.println(word3.charAt(i));
        }
    }
}
