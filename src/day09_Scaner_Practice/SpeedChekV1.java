package day09_Scaner_Practice;
import java.util.Scanner;
public class SpeedChekV1 {
    public static void main(String[] args) {
        int speedlimit = 55;
        int currentspeed= 75;
        int overlimit = currentspeed-speedlimit;
        System.out.println("your over speed limit is " + overlimit+ "mph slow down");
    }
}
