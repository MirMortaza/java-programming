package day28_Array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which month number do you want");
        int mon = input.nextInt();
        String [] months={"january", "februray","march","april","may","june","july","august","September","October","nonmber"} ;
        System.out.println(months[mon-1]);
    }
}
