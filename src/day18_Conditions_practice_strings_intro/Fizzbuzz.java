package day18_Conditions_practice_strings_intro;

public class Fizzbuzz {
    public static void main(String[] args) {
        int number = 30;
        if(number % 3==0 && number % 5==0 ){
            System.out.println("fizzbuzz");
        }else if(number % 3==0){
            System.out.println("fizz");
        }else if(number % 5 == 0){
            System.out.println("buzz");
        }

    }
}
