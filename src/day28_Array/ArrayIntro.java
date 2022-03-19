package day28_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String city = "chicago";
        String city2 =" washington";
        String city3 = "falls church";
        String city4 = "arlington";
        String city5 ="virginia";

        String [] cities = {"chicago", "washington", "falls church" , "arlington", "virginia"};

       String [] cities2 ={city,city2,city3,city4,city5};

        System.out.println(cities[0] );
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // we can print all cities in one line

        System.out.println(" Revers order of the cities " + cities[4] + "," + cities[3] + "," + cities[2] + "," +cities[1] +"," +cities[0]);
        System.out.println(cities);
        System.out.println(Arrays.toString(cities)); //the method from arrays class let you print array fully

        System.out.println(cities.length);
    }
}
