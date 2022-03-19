import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
         String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        for( String day : days){
            System.out.println(day);
        }
        System.out.println();

        String [] withOutDay = s.split("day");
        for(String each :withOutDay){
            System.out.println(each);
        }
        System.out.println();

        String str = "jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Out-Nov-Dec";

        String [] months= str.split("-");

        for(String each : months){
            System.out.println(each);
        }

    }
}
