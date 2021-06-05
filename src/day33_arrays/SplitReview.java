package day33_arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word= "java";
        String[] array=word.split("a");
        System.out.println(array.length);
        int countOfA= array.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA ="+countOfA);

        System.out.println("------SPLIT WITH EMPTY STRING-----");
        String[] str=word.split("");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);


        String word2="java1sql2ht4ml";

    }
}
