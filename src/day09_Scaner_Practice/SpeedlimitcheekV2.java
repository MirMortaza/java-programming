package day09_Scaner_Practice;
import java.util.Scanner;
public class SpeedlimitcheekV2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter current speed");
        int currentspeed= scan.nextByte();
        int speedlimit = 55;
        int overspeedlimit = currentspeed-speedlimit;
        System.out.println("you are driving " + overspeedlimit +" mph over the limit. slow down");
    }
}
