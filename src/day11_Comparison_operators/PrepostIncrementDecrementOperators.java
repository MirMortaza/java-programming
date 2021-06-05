package day11_Comparison_operators;

public class PrepostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 =10;
        int num2 = ++num1;   //++ Means increase by 1
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        int num3 = 4;
        int num4 = num3;
         num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
        
        int kiwi = 15;
        int kiwibasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwibasket = " + kiwibasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);
    }
}
