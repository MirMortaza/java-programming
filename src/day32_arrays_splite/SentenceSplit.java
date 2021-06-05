package day32_arrays_splite;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "mir is coding java and enjoying";
        String[] words= sentence.split(" ");
        System.out.println("first word = "+words[0]);
        System.out.println("second word = "+words[1]);
        System.out.println("third word = "+words[2]);

        System.out.println(Arrays.toString(words));
        for(String w :words){
            System.out.println(w);
        }
        String googleresult= "about 1,810,000 results (0.68)";
        String[] results = googleresult.split(" ");
        System.out.println("count = "+results[1]);
        System.out.println("second = "+results[3].replace("", ""));
        System.out.println("second = "+results[3].substring(1));
    }
}
