package day09_Scaner_Practice;
import java.util.Scanner;

public class FarinhittoCelcuse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter the Farenheit");
        double Farenheit = scan.nextDouble();
        double celsius = (Farenheit - 32)*5/9;
        System.out.println(" " + Farenheit+ " farenheit is " + celsius + " celsius");
    }
}
