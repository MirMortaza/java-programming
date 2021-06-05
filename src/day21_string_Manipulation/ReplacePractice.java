package day21_string_Manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " +word);
        
        word = word.replace("hub" ,"lap");
        System.out.println("word = " + word);

        System.out.println(word.replace('i','o').replace('a','i'));

        String sentence = "java is fun";
        String withnospace = sentence.replace(" ","");
        System.out.println("withnospace = "+withnospace);
        
        sentence=sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println(" sentence= " + sentence);
    }
}
