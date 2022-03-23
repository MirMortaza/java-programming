package day33_VoidMethods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String [][] words={{"james","is","back"},{"he","was","never","gone"},{"methods","tomorrow"}};

        for(String[]  eachArray:words){
            for(String eachWord : eachArray){
                System.out.print(eachWord.charAt(eachWord.length()-1));
            }
            System.out.println();
        }
    }
}
