package day17_ternary_nested_conditions;

public class TernaryEXamples {
    public static void main(String[] args) {
        int score = 90;
        String quality ="good";
        String result = (score > 60)? "pass": "fail";
        System.out.println(result);

        int x = (quality.equals("good"))? 100 : 0;
        System.out.println(x);

        score=100;
        char grade = (score>90)? 'A' : 'B';
        System.out.println(grade);
        String evenodd = (score%2==0)?"even" : "odd";
        System.out.println(evenodd);
        
        int score3 = 100;
        char grade1 = (score3 > 90 )? 'A': 'B';
        System.out.println("grade1 = " + grade1);
    }
}
