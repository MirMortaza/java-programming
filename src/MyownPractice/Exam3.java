package MyownPractice;


import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       boolean isTall = scan.nextBoolean();
       boolean isfast = scan.nextBoolean();
       boolean isflexible = scan.nextBoolean();
       String sport="";
       if(isTall){
           if(isfast){
               sport=" basketball";
           }else if(isflexible){
               sport="gymnastic";
           }else {
               sport ="volleyball";
           }

       }else {
           if (isfast) {

               sport= "soccer";
           }else {
               sport= "tennis";
           }
       }
        System.out.println(sport);

    }
}
