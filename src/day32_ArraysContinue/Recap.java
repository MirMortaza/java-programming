package day32_ArraysContinue;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr= {30,90,60,360,180};
        int [] arr2= {180,360,60,90,30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(" before sorting:"+ Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " +Arrays.equals(arr,arr2));


        String [] words= {"hello","java","saturday"};
        System.out.println(String.join(" ### ", words ));


        String str ="Today is saturday";
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(Arrays.toString(str.split(" ")));
    }
}
