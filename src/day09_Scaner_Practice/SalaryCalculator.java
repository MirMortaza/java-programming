package day09_Scaner_Practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println("Enter hourly rate");
        int hourlyrate = 50;
        int weekly = hourlyrate*40;
        double monthly = weekly*52/12;
        double annuly = monthly*12;
        System.out.println("weekly pay is: " + weekly);
        System.out.println("monthly pay is: " + monthly);
        System.out.println("annuly pay is " + annuly);



    }
}
