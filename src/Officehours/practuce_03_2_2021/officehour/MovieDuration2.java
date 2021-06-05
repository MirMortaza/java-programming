package Officehours.practuce_03_2_2021.officehour;
import java.util.Scanner;
public class MovieDuration2 {
    Scanner scan = new Scanner(System.in);
    double movielenght=scan.nextDouble();
    double price=0;{
        if(movielenght==1.0){
           price=8.99; 
        }
        if(movielenght==1.5){
            price=10.50;
        }
        if(movielenght==2.0){
            price=12.99;
        }
        if(movielenght==2.50){
            price=14.50;
        }
        System.out.println("scan = " + scan);
    }
    
    
    
    
}
