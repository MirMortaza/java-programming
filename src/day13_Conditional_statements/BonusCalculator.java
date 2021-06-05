package day13_Conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesamount = 2000.55;
        if (salesamount <= 1000) {
            System.out.println("good job you qualified for bonus");
            bonus = 50;
        } else {
            System.out.println("good job you qualified for bonus");
            bonus = 100;

        }
        System.out.println("your total bonus:$" + bonus);
    }

}
