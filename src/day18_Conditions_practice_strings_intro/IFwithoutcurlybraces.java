package day18_Conditions_practice_strings_intro;

public class IFwithoutcurlybraces {
    public static void main(String[] args) {
        String todayclass = "python";

        if(todayclass.equals("java"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java. it is " + todayclass);


        int a = 1;
        if(a == 1){
            System.out.println("a is 1");
            System.out.println("1 is a");
        }



    }
}
