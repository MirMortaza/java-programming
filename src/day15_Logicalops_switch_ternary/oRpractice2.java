package day15_Logicalops_switch_ternary;

public class oRpractice2 {
    public static void main(String[] args) {
        String company = "google";
        double salary = 85000.0;
        if(company.equals("google") || salary >=100_000){
            System.out.println("accepting offer from " + company);
        }else {
            System.out.println("rejecting offer from " +company);
        }
    }
}
