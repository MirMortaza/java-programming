package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,23)); //0
        System.out.println(Arrays.binarySearch(nums,2344)); //3
        System.out.println(Arrays.binarySearch(nums,25));
        System.out.println(Arrays.binarySearch(nums,70000));
        System.out.println(Arrays.binarySearch(nums,-7));

        //check if number 12345 is among numbers is array
       if(Arrays.binarySearch(nums, 12345) <=0){
           System.out.println("12345 is present inarray");
       }else {
           System.out.println("12345 is not present");
       }
    }
}
