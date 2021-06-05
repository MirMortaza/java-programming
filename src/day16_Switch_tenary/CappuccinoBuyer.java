package day16_Switch_tenary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 3.69;
        double calories = 90;
        if(size.equals("tall")){

        }
        switch (size){
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println(size + "cappuccino please");
                System.out.println("price is $3.69");
                System.out.println("it has " + calories+ "calories");
                break;
            case "grande":
                price = 4.99;
                calories = 210;
                System.out.println("grande cappuccino please");
                price = 5.99;
                calories = 240;
                break;
            case "small":
                System.out.println("small cappuccino please");
                price = 6.99;
                calories = 450;
                break;
            default:
                System.out.println("we don`t serve that " +size+ "cappuccino");
                break;


        }
        System.out.println("your total price is " +price);
           }
}
