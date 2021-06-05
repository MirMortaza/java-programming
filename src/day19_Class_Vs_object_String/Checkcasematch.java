package day19_Class_Vs_object_String;

import java.util.Locale;

public class Checkcasematch {
    public static void main(String[] args) {
        String countrycode = "afg";
        if(countrycode.equals(countrycode.toUpperCase())){
            System.out.println("afghanistan code is match");
        }else{
            System.out.println(" afghanistan code did n`t match");
        }

        String word = "java";
        String uword = word.toUpperCase();
        System.out.println(word);
        System.out.println(uword);
        if(word.equals(uword.toUpperCase())){
            System.out.println("it change to upper case");
        }else {
            System.out.println("it did not change to upper case");
        }
    }
}
