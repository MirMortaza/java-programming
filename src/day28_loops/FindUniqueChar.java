package day28_loops;

public class FindUniqueChar {
    public static void main(String[] args) {
        String word = "jaavvaa";
        String word2="";
        for(int i = 1;i<word.length();i++){
            if(word2.contains(word.charAt(i)+"")){
                word2+=word.charAt(i);
            }
        }
        System.out.println("word2 = "+word2);
    }
}
