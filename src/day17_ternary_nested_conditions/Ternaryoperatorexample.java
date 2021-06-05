package day17_ternary_nested_conditions;

public class Ternaryoperatorexample {
    public static void main(String[] args) {
        int hourlyrate = 50;
        
        String reply = (hourlyrate > 45)? "accept" : "reject";
        System.out.println("reply = " + reply);
        
        String todayclass = "java";
        String teacher = (todayclass.equals("java"))? "saim & muradil" :" nadir";
        System.out.println("today teachers ARE = " + teacher);
        
        boolean iseligibletodrive = false;
        String driving = iseligibletodrive ? "have dl, can drive" : "no DL, can`t drive";
        System.out.println("driving = " + driving);
    }
}
