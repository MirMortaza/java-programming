package day04_Variable_intro;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);
        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int n4 = 500;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        int parvinzipcode = 22182;
        int mirzipcode = parvinzipcode;
        System.out.println(parvinzipcode);
        System.out.println(mirzipcode);
         parvinzipcode = 22185;
         mirzipcode = 22041;
         System.out.println(parvinzipcode);
         System.out.println(mirzipcode);

    }
}
