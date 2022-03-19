package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How many friends do you have");
        int size =input.nextInt();
        String [] friendList = new String[size];
        for (int i = 0; i < friendList.length; i++) {

            System.out.println("Enter friends name " +(i+1));
            friendList[i]=input.nextLine();


        }
        System.out.println(Arrays.toString(friendList));


    }
}
