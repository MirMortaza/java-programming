package day14_multi_branch_if_statement;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1=500;
        double num2=600;
        char operator='+';
        if(operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else if(operator=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("great job");
        }

    }
}
