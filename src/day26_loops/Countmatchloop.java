package day26_loops;

public class Countmatchloop {
    public static void main(String[] args) {
        String word="java";
        char letter='a';
        int count = 0;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)=='a'){
                count++;

            }
        }
        System.out.println("there are "+count+" "+letter+"`s in " +word);
    }
}
