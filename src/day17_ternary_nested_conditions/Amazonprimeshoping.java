package day17_ternary_nested_conditions;

public class Amazonprimeshoping {
    public static void main(String[] args) {
        int itemprice = 15;
        boolean isprimember = false;
        if(isprimember){
            System.out.println("Eligible for free 2 day shipping");
        }else {
            if(itemprice >= 25.5){
                System.out.println("Eligible for free regular shipping ");
            }else {
                System.out.println("not eligible for free shipping. shipping fee will be $9");
            }
        }
    }
}
