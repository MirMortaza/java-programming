package day14_multi_branch_if_statement;

public class java {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        System.out.println(y++ +""+ x++ + "" +y);


        int score = 0;
        if(score==0){
            score+=50;
        }
        if(score!=0){
            score+=50;
            System.out.println(score);
        }
        int num= 9;
        if(num++ ==10)
            System.out.println("num = " + num);
    }
}
