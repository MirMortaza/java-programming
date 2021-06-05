package day15_Logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "kabul";
        String city2 = "mascow";
        if(city.equals("kabul") || city2.equals("mascow")){
            System.out.println("willing to relocate to " + city);
        }else {
            System.out.println("not considring to " + city2);
        }
        String teacher = "mir";
        if(teacher.equals("saim") || teacher.equals("muradil")){
            System.out.println("it is java class with " + teacher);
        }else {
            System.out.println("soft skill class with " + teacher);
        }



        if(teacher.equals("saim") || teacher.equals("nadir")){
            System.out.println("it is java class " + teacher);
        }else if(teacher.equals("mir"))
            System.out.println("soft skill with class with " + teacher);

        }

    }

