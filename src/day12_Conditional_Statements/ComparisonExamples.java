package day12_Conditional_Statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentspeed = 45, speedlimit=55;
        boolean isspeeding = currentspeed > speedlimit;
        System.out.println("isspeeding = " + isspeeding);

        System.out.println(currentspeed > speedlimit);
        System.out.println(currentspeed==speedlimit);
        System.out.println("are you speeding? " + isspeeding);

        currentspeed +=20;

        isspeeding = currentspeed > speedlimit;

        System.out.println("are you speeding? " );

        double accountbalace = 250.25;
        double itemprice = 100.99;
        System.out.println("can i afford? " + (accountbalace >= itemprice));
        
        boolean caniafford = accountbalace>=itemprice;
        System.out.println("caniafford = " + caniafford);
        
        accountbalace= accountbalace-itemprice;
        accountbalace-=itemprice;
        System.out.println("caniafford = " + caniafford);
        
        
        boolean isbroke = accountbalace<=0;
        System.out.println("Am i broke = " + isbroke);
        
    }
}
