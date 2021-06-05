package day14_multi_branch_if_statement;

public class IFwithoutelse {
    public static void main(String[] args) {
        int year = 2025;   // 2020 and 2025 is not equal it will not work**********
        if (year==2020){
            System.out.println("Covid 19 pandemic year");
            System.out.println("wear your mask and distance");
        }
        System.out.println("keep coding java");

        String country  = "USA";
        if (country.equals("USA")){
            System.out.println("washington DC is the capitol");
            System.out.println("white is in pensivenia ave");
        }

        System.out.println("welcome to " + country);

    }
}
