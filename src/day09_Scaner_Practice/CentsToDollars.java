package day09_Scaner_Practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Cent here");
        double cent = scan.nextDouble();
        double dollars = cent/100;
        double remianing= cent%100;
        System.out.println(cent + " cent is "+ dollars + " dollars " + remianing+ " cent ");
    }
}
