package day32_ArraysContinue;

import java.util.Arrays;

public class AddingElement {
    public static void main(String[] args) {



        int  [] a = {45,123,62};
        int [] b= Arrays.copyOf(a,4);
        b[3]=100;

        System.out.println(Arrays.toString(b));


    }
}
