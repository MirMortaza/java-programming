package day15_Logicalops_switch_ternary;

public class oRlogicaoperators {
    public static void main(String[] args) {

        System.out.println("true || true = "+ (true || true));
        System.out.println("true || false = "+ (true || false));
        System.out.println("false || true = "+ (false || true));
        System.out.println("false || false = "+ (false || false));
        int apples = 5;
        int oranges = 10;
        if(apples > 1 || oranges < 20){
            System.out.println("yes lets buy some");

        }else {
            System.out.println("No thats not true");
        }
        System.out.println(apples > 2 || oranges > 10);
        if(apples > 2 || oranges > 10){
            System.out.println("looks like we need to buy fruits");
        }else {
            System.out.println("no need to buy fruits");
        }
        System.out.println(apples == 0 || oranges == 0);
        if (apples == 0 || oranges == 0){
            System.out.println("we need to purchase some fruits");
        }else {
            System.out.println("we are good with the fruits");
        }
    }
}
