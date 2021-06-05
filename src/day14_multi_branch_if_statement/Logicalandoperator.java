package day14_multi_branch_if_statement;

public class Logicalandoperator {
    public static void main(String[] args) {
        System.out.println(true && true);  // ture
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false);  // false

        System.out.println(10 > 5 && 1 == 1);
        System.out.println(99 < 100 && 22 > 25);
        System.out.println(1 > 2 && 5 > 2);
        System.out.println(2 < 1 && 5 < 4);


        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

        if( apples >  6 && oranges  > 2) {
            System.out.println("i have enough apples and oranges");

        } {

        }
    }

}
