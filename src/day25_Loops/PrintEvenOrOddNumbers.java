package day25_Loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers 0 - 100: ");

       for(int n =1; n<100; n++){
           if(n % 2==0 ){
               System.out.print(n + " ");
           }
       }
        System.out.println("\nodd numbers 0- 100:");
       for(int k =0; k<=100; k++){
           if(k %2!=0){
               System.out.print(k + " ");
           }
       }
    }
}
