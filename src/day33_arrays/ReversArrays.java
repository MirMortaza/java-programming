package day33_arrays;

import java.util.Arrays;

public class ReversArrays {
    public static void main(String[] args) {
        int[] nums={5, 10, 4, 100};
        int[] numsRev= new int[nums.length];

        for(int i =nums.length-1;i>=0;i--){
            numsRev[i]=nums[nums.length-1-i];
            System.out.print(Arrays.toString(numsRev));
        }
    }
}
