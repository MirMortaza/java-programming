package day26_loops;

public class Multiplication {
    public static void main(String[] args) {
        int count = 6;
        int number =1;
        if(count<1 ||count>10){
            System.out.println("Error invalid number");
            return;
        }
        for(int i = 1;i<=10;i++){
            number=i*count;
            System.out.println(i+"x"+count+ "="+number);
        }

    }
}
