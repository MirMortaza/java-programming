package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source="ABCDEFGHIJKLMNOPQRSTUVWXyzabcdefghijklmnopqrstuvwxyz2345678_@#$%&*";
        Random random=new Random();

        String password ="";
        for(int i =1;i<=8;i++){
            int index= random.nextInt(68);
            password+=source.charAt(index);

            System.out.println(" \nyour password is "+password);


        }
    }
}
