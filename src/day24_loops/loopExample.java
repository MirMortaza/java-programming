package day24_loops;

public class loopExample {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count>=0){
            System.out.println("finished the count " +count);
            count--;
            Thread.sleep(500);  // if you want make slower
        }
        System.out.println("we did not finished the class");


        int unreadSMS = 10;
        while (unreadSMS>=0){
            System.out.println("you read all the messages = " +unreadSMS);
            unreadSMS--;

        }


    }
}
