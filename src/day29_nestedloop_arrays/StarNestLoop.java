package day29_nestedloop_arrays;

public class StarNestLoop {
    public static void main(String[] args){
        for(int i = 1;i<=10;i++){
            for(int j =1;j<=10;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j =1;j<=20;j++){
            for(int k=1;k<j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
