package day32_ArraysContinue;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [][] cydeo= new String[4][];

        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne ={"mir","asmat","mortaza"};
        cydeo[0]=groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 2");

        String [] groupTwo= {"basir","yasir","obaid","shina"};

        cydeo[1]=groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 3");
        cydeo[2] =new String[]{"mustafa","lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3]= cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));
    }
}
