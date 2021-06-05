package day15_Logicalops_switch_ternary;

public class Cardealership {
    public static void main(String[] args) {
        double budget = 5000;
        String modal = "Honda";
        double carprice = 8999.0;
        if(carprice <= budget && modal.equals("Honda") || modal.equals("toyota") || modal.equals("Tesla")){
            System.out.println("ready to purchase model = " + modal + ", price " + carprice);
        }else {
            System.out.println("not interested in model = " + modal + "; price "+ carprice);
        }

        //  this is mean not (!)   mean not operator
        //  !true --> false
        //  !false --> true
    }
}
