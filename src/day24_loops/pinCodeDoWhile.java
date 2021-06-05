package day24_loops;
import java.util.Scanner;
public class pinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secrerpincode=1234;
        int pincode;
        do {
            System.out.println("Enter pin code: ");
            pincode=scan.nextInt();
        }while (secrerpincode!=pincode);
        System.out.println("welcome to your bank account");

    }
}
