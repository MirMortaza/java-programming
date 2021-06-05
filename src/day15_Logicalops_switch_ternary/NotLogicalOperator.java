package day15_Logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
         // != --->is not equal comparison operator
        System.out.println(" !true = " + true);
        System.out.println("!false = " + false);
        int age = 20;
        if(!(age> 7)){
            System.out.println("need to sit in child car seat age " + age);
        }else{
            System.out.println("can sit in passenger seat. age = " + age);
        }

        boolean issmokingallowed = false;
        if(!(issmokingallowed==true)){
            System.out.println("Smoking is not allowed here. Exit please "  );

        }

        boolean isaffordable = true;
        if(!isaffordable){
            System.out.println("item not affordable");
        }else {
            System.out.println("lets buy it.");
        }

        String carmodel = "Tesla";
        if (!carmodel.equals("Tesla")){
            System.out.println("not intrested thank you");
        }

        String secretpassword = "abc123";
        String inputpassword = "abc321";
        if(! inputpassword.equals("abc123")){
            System.out.println("correct password");
        }
        if(!inputpassword.equals(secretpassword)){
            System.out.println("incorrect password");
        }
    }
}
