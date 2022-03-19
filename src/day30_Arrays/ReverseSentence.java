package day30_Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String day = "today is monday";
        String [] eachword = day.split(" ");

        String reversed = "";
        for (int i = eachword.length-1; i >=0 ; i--) {
            reversed += eachword[i] +" ";


        }
        System.out.println(reversed.trim());
    }
}
