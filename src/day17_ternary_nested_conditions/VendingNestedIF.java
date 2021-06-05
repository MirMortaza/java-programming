package day17_ternary_nested_conditions;

public class VendingNestedIF {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea ;coke";
        String snack = "chips; candy";
        if(selection.equals("drink")){
            System.out.println("drink option selected");
            if(drink.equals("tea")){

            }
        }else {
            if(drink.equals("coke")){
                System.out.println("coke item selected");
            }else {
                if(snack.equals("chips")){
                    System.out.println("chips item selected");
                }
            }
        }
    }
}
