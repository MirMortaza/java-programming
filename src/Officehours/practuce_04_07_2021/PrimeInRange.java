package Officehours.practuce_04_07_2021;

public class PrimeInRange {
    public static void main(String[] args) {
        int number = 50;
        boolean isPrime= true;    //  5/2 , 5/3 , 5/4
        for(int i = 2; i< number; i++){
            if(number% i  ==0){
                isPrime =false;
                break;
            }
        }
        System.out.println("isPrime = " + isPrime);
    }
}
