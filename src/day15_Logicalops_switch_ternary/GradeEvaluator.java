package day15_Logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'E';
        if(grade == 'A' || grade == 'B' || grade == 'c' || grade == 'd'){
            System.out.println("when grade is "+ grade);
        }else if( grade=='D'){
            System.out.println("you passed the exam with grade " + grade);
        }else if(grade=='E'){
            System.out.println("you also passed the exam with grade " + grade);
        }else{
            System.out.println("sorry you could`nt passed the exam with grade " + grade);
        }
    }
}
