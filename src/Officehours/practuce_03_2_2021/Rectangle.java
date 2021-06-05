package Officehours.practuce_03_2_2021;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your lenght");
        double lenght = input.nextDouble();
        System.out.println("Enter your width");
        double width = input.nextDouble();
      //  double lenght= 5;
      //  double width=3;

        double perimeter = 2 * (lenght+width);
        double area= lenght * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
