package day14_multi_branch_if_statement;

public class DayActivity {
    public static void main(String[] args) {
        String weather="sunny";
        if(weather.equals("sunny")){
            System.out.println("go to park, hiking");
        }else{
            if(weather.equals("rainy")){
                System.out.println("stay home and conding java");
            }else{
                if(weather.equals("snowy")){
                    System.out.println("make snow man and sliding");
                }else{
                    if(weather.equals("windy")){
                        System.out.println("fly the kit and playing around");
                    }
                }
            }
        }
    }
}
