package day30_Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String word = "java always fun ";

        String[] middleWord= word.split(" ");

        String reverse = "";

        char [] middleword = middleWord[1].toCharArray();
        for (int i = middleword.length-1; i >=0 ; i--) {
            reverse += middleword[i];

        }
        System.out.println(middleWord[0] + " " +reverse + " "+ middleWord[2] );
    }
}
