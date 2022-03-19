package day27_Nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {
        int range = 100;
        for (int i = 2; i <=range ; i++) {//the purpose of the this loop is to check all the number from 2 to the value the range variable
            int count =0;  //putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) {

                if(i % j ==0){
                    count++;
                }

            }
            if(count == 0) {
                System.out.print(i + " , ");
            }

            }
    }

}
