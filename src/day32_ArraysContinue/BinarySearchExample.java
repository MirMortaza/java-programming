package day32_ArraysContinue;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] nums= {4,22,30,100};
        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,200));
        System.out.println(Arrays.binarySearch(nums,6));
    }
}
