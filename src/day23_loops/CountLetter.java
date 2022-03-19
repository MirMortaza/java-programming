package day23_loops;

public class CountLetter {
    public static void main(String[] args) {

        String num= "aaabjdaaa nnddaa";
        int count =0;
        for (int i = 0; i < num.length() ; i++) {
            System.out.println(num.charAt(i));
            if (num.charAt(i)== 'a'){

                count++;
            }
            System.out.println(" there is "+count);

        }
    }
}
