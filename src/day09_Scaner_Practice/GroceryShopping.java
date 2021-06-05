package day09_Scaner_Practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter price for milk");
     double milk = scan.nextDouble();
     System.out.println("Enter price for bread");
     double bread = scan.nextDouble();
     System.out.println("Enter prince for cucumber");
     double cucumber = scan.nextDouble();
     double Total = milk+bread+cucumber;
     System.out.println("Total price " + Total);
    }
}
