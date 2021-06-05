package day18_Conditions_practice_strings_intro;

public class THreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 440;
        int num3 = 110;
        if(num1 > num2 && num1 > num3  ){
            System.out.println(num1 +" is largest number " );
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2+ " is the largest");
        }else {
            System.out.println(num3+ "is the largest");
        }
    }
}
