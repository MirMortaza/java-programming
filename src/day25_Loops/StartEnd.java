package day25_Loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int start =scan.nextInt();
        int end = scan.nextInt();
        for(int i =0;start<=end;start++ ){
            System.out.println(start);
        }


    }
}
