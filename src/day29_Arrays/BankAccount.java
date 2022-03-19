package day29_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] bankAccount1= {"mir mortaza","checking","10000343","100,000,000"};
        System.out.println(bankAccount1.length);
        System.out.println(Arrays.toString(bankAccount1));

        System.out.println("Name:     " +bankAccount1[0]);
        System.out.println("Account type: " + bankAccount1[1]);
        System.out.println("Account number: " +bankAccount1[2]);
        System.out.println("Account balance:" +bankAccount1[3]);

        String [] Bankaccount2= new String[4];
        System.out.println(Arrays.toString(Bankaccount2));
       Bankaccount2[0]="james bond";
       Bankaccount2[1]="saving";
       Bankaccount2[2]="123456678";
       Bankaccount2[3]="100,234,567";
        System.out.println(Arrays.toString(Bankaccount2));

        String [] bankaccount3=new String[4];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname= input.nextLine();
        bankaccount3[0]= firstname;
        System.out.println("Enter your account type");
        bankaccount3[1]=input.nextLine();
        System.out.println("Enter your account number");
        bankaccount3[2]=input.nextLine();
        System.out.println("Enter your balance ");
        bankaccount3[3]=input.nextLine();
        System.out.println(Arrays.toString(bankaccount3));


        String [] bankaccount4=new String[4];
        String [] Questions= {"full name ", "account type","account number","account balance"};
        for (int i = 0; i < bankaccount4.length; i++) {
           bankaccount4[i] =input.nextLine();

        }
        System.out.println(Arrays.toString(bankaccount4));



    }
}
