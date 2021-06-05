package day24_loops;

public class YouTubecatVedieo {
    public static void main(String[] args) throws InterruptedException {
        int second = 0;
        while(second<=117){
            System.out.println("watching  \uD83D\uDC08 at second: " +second );
            second++;
            Thread.sleep(1000);
        }
        System.out.println("finished watching cat video, lets start another one");


    }
}
