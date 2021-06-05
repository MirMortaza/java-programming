package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberstop = scan.nextInt();
        int start = 1;

        while(start<=numberstop){
            System.out.print(start+" ");
            start++;

        }

    }
}
