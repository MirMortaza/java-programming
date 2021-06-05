package day29_nestedloop_arrays;

public class MultiplicationLoops {
    public static void main(String[] args) {
        for(int i = 1;i<=11;i++){
            for(int j=1;j<=11;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
