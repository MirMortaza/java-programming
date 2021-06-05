package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("full name ="+fullName());
        System.out.println("is married ="+ismarried());
        System.out.println("age ="+getAge());
        System.out.println("random year = "+ getRandomYear());
    }
    public static String fullName(){
        return "mike smith";
    }
    public static boolean ismarried(){
        return false;
    }
    public static int getAge(){
        int age=35;
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int RandomYear=random.nextInt(2021);
        return RandomYear;
    }


}
