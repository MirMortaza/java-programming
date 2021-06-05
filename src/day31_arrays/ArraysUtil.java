package day31_arrays;
import java.util.Arrays;
import java.util.Collection;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums={5, 1, 7, 4, 6, 8,};
        //print all nums in same line
        System.out.println(Arrays.toString(nums));


         //sort nums
        Arrays.sort(nums);
        // print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //sort words in revers order




    }
}
