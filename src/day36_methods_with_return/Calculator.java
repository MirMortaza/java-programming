package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(10,3.5));
        double sum=add(1,5);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 ="+add(100,200));
        System.out.println("minus ="+minus(13,5));
    }
    public static double add(double num1, double num2){
        double result=num1+num2;
        return result;
    }
    public static double minus(double num1, double num2){
        double result = num1-num2;
        return result;
    }
}
