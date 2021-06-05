package day11_Comparison_operators;

public class BooleanComparisopretors {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(332.445<877665.876);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-100!=44);
        
        int a = 100;
        int b = 200;
        System.out.println(a == b);    //false
        System.out.println(a > b);     //fales
        System.out.println(a < b);     // true
        System.out.println(a >= b);    //fales
        System.out.println(a <= b);    //true
        System.out.println(a != b);    //true
        
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33>44;
        System.out.println("result = " + result);
        
        result = 88<99;
        System.out.println("result = " + result);
        
        result = 10>=10;
        System.out.println("result = " + result);

        result = 123<=124;
        System.out.println("result = " + result);
        
        result = 2 != 2;
        System.out.println("result = " + result);
        
        String city = "seattle";
        System.out.println(city ==  "seattle");
        System.out.println(city == "kabul");
        System.out.println(city != "falls church");
        
        
        String name = "Mir";
        boolean checkname = name == "MIR";
        System.out.println("checkname = " + checkname);


                
                
    }
}
