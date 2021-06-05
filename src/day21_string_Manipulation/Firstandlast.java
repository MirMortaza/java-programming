package day21_string_Manipulation;

public class Firstandlast {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char third  = word.charAt(2);
        if(first==third){
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letter mismatch");
        }
        if(word.charAt(0)== word.charAt(2)){
            System.out.println("first and last letter match");
        }
        String anotherword ="aziza";
        char firstletter = anotherword.charAt(0);
        int count = anotherword.length();
        char lastletter = anotherword.charAt(anotherword.length() -1);
        System.out.println(firstletter);
        System.out.println(lastletter);
    }
}
