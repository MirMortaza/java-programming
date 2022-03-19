package day29_Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4,1,3,12,5,20,13};
        int evens=0;
        int odd=0;

        String evennums = "";
        String oddnums = "";
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] % 2 ==0){
//                evens++;
//                evennums +=nums[i] +"";
//
//            }else {
//                odd++;
//                oddnums +=nums[i] + "";
//
//            }
//
//        }
        for( int number: nums){
            if(number % 2 ==0){
                evens++;
                evennums += number + "";

            }else {
                odd++;
                oddnums += number + "";
            }
        }
        System.out.println("Even counter " + evens);
        System.out.println("Even number " + evennums);

        System.out.println("odd counter " +odd);
        System.out.println("odd number " +oddnums);

    }
}
