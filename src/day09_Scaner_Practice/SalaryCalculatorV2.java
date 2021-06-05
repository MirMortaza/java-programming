package day09_Scaner_Practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyrate= scan.nextDouble();
        double weekly = hourlyrate*40;
        double monthly = weekly*52/12;
        double annualy = monthly*12;
        System.out.println("weekly pay is: " + weekly);
        System.out.println("monthly pay is: " + monthly);
        System.out.println("annuly pay is " + annualy);


    }
}
