package day29_Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int [] nums={30,12,159,12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("traditional " + nums[i]);

        }
        System.out.println();
        for (int element : nums) {
            System.out.println("for each " +element);

        }

        //String example

        String[] classes= {"java","soft skill","selenium","darabase","api"};
        //traditional

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);

        }

        //for each
        System.out.println();

        for(String word : classes){
            System.out.println(word);
        }

        //double example
        System.out.println();
        double [] prices= {10.4,40.4,412.45};

        //for each
       for (double each :prices){
           System.out.println("$ " +each);
       }




    }
}
