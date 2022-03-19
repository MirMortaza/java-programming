package day30_Arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char []letters = {'j','a','v','a'};
        String word = "java";

        // converting a String to char []

       char [] java= word.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        System.out.println(letters);
        // print every letter in my string

        for(char eachChar : java){  // for(char eachChar : word.toCharArray()){    you can do like that too.
            System.out.println(eachChar);
        }
        System.out.println(java[0]);

        // converting a char array to a String
        char[] day = {'m','o','n','d','a','y'};
        System.out.println(day.length);
        String strday = new String(day);
        System.out.println(strday);



    }
}
