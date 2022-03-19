package day28_Array;

public class MazMin {
    public static void main(String[] args) {
        int []num={500,120,-80,90,250,-10};
        int bigest= num[0];
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            int number =num[i];
            if(number>bigest){
                bigest=number;

            }
            if(number<smallest){
                smallest=number;
            }

        }
        System.out.println("bigest " + bigest);
        System.out.println("smallest " + smallest);


    }
}
