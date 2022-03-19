package day27_Nested_loops;

public class UniqueChracters {
    public static void main(String[] args) {
        String str = "AAABCCDEEFYZZX";
        for (int i = 0; i <str.length() ; i++) {
            char latter = str.charAt(i);
           int count=0;

            for (int j = 0; j < str.length(); j++) {
                char inner =str.charAt(j);

               // System.out.print(latter + " - " + inner);
                if(latter == inner){
                    count++;
                }
            }
            if(count==1){

                System.out.print(latter);
            }

        }
    }
}
