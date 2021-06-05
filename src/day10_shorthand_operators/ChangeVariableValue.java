package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count =3;
        System.out.println("count = " + count);
        //add / increase count by 2
        count = count + 2;
        System.out.println("count = " + count);
        
        int apple = 2;
        System.out.println("apple = " + apple);
        apple= apple + 10;
        System.out.println("apple = " + apple);
        int pizzaslices = 8;
        System.out.println("pizzaslices = " + pizzaslices);
        pizzaslices= 8/2;
        System.out.println("pizzaslices = " + pizzaslices);
        int cents = 244;
        System.out.println("cents = " + cents);
        cents= cents % 100;
        System.out.println("remaining cents = " + cents);
        
    }
}
