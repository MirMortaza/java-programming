package day32_arrays_splite;
import java.util.Arrays;
public class StringSplitMethod {
    public static void main(String[] args){
        String word = "java:python:selenium:html";
        String[] wordArray=word.split(":");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("lenght of array = "+wordArray.length);
        for(String each :wordArray){
            System.out.println(each);
        }


        String sentence="today i am coding java arrays";
        String[] sentencearrays=sentence.split(" ");
        System.out.println(Arrays.toString(sentencearrays));
        System.out.println("length of array = "+sentencearrays.length);

        System.out.println(sentencearrays[0]);
        System.out.println(sentencearrays[0]+" "+sentencearrays[1]);
        for(String any: sentencearrays){
            System.out.println(any);
        }
    }
}
