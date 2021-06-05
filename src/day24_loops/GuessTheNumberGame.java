package day24_loops;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secretnumber=15;
        int guessingnumber;
        do {
            System.out.println("Guess the secret number from 0-100");
            guessingnumber=scan.nextInt();
            if(guessingnumber>secretnumber){
                System.out.println("wrong you number is to0 large");
            }else if(guessingnumber<secretnumber){
                System.out.println("wrong your number is too small");
            }
        }while (guessingnumber!=secretnumber);
        System.out.println("your gussed number is right");
    }
}
