package day18_Conditions_practice_strings_intro;

public class MultiBranchif {
    public static void main(String[] args){
        int number = 5;
        if(number > 0){
            System.out.println( number+ " is positive");
        }else if(number<0){
            System.out.println(  number+" number is negative");
        }else {
            System.out.println( number +"is zero");
        }
    }
}
