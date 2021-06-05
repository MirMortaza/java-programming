package MyownPractice;
import java.util.Scanner;
public class Agetoday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the movie");
        double movielenght = input.nextDouble();


        if(movielenght == 1.0 ){
            System.out.println("price: 8.99 " );
        }
        if(movielenght== 1.5){
            System.out.println("price:");
        }
    }
}
