package day09_Scaner_Practice;
import java.util.Scanner;
public class Mile2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = scan.nextDouble();
        double kilometer = miles * 1.609;
        System.out.println(miles+ " miles in kilometer " + kilometer);
    }
}
