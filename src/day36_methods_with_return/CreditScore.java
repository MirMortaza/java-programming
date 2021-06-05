package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(720);

    }
    public static void checkEligible(int creditScore){
        if(creditScore>=692){
            System.out.println("you are eligible to buy car");
        }else {
            System.out.println("you are not eligible");
        }
    }
}
