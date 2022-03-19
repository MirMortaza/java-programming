package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String list = "Shopping list:";
        String addMore ;
        do{
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine();
            System.out.println("Do you want more to your shopping cart");
            addMore= input.nextLine();
        } while(addMore.equalsIgnoreCase("yes"));

        System.out.println(list);
    }
}
