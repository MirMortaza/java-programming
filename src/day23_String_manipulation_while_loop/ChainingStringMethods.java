package day23_String_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().length());
        System.out.println(word.replace(" ","").toUpperCase(Locale.ROOT));

        String city = "ISTANBUL ";
        System.out.println(city.substring(0,1).toUpperCase(Locale.ROOT)+city.substring(1).toLowerCase());
    }
}
