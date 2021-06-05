package day19_Class_Vs_object_String;

import java.util.Locale;

public class LengthOFtheString {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.length());

        String name = "mir mortaza";
        System.out.println("my name has " +name.length()+ " character");
        
        int count = name.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if(password.length()>=6){
            System.out.println("valid amazon password");
        }else {
            System.out.println("password must be 6 characters");

            String countrycode = "afg";
            if(countrycode.equals(countrycode.toUpperCase())){
                System.out.println("country code is " +countrycode);
            }
        }

    }
}
