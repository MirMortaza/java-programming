package day15_Logicalops_switch_ternary;

public class Jobofferselector {
    public static void main(String[] args) {
        String location = "washington DC";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean benefits = true;
        if(location.equals("washington DC")&& salary==120_000.0 && isRemote &&benefits){
            System.out.println("Accepet job offer it`s awesome");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
