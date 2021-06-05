package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word2 = "java";

        for(int  i=3;i>=0;i--){
            System.out.println(word2.charAt(i));

        }
        for (int i =0;i>=word2.length();i--){
            System.out.println(word2.charAt(i));
        }
    }
}
