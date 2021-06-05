package day18_Conditions_practice_strings_intro;

public class ScoreRangetesk {
    public static void main(String[] args) {
        int score = 95;
        if(score > 1 && score< 40){
            System.out.println("Grade D");
        }else if(score >= 40 && score <= 60 ){
            System.out.println("Grade C");
        }else if(score >= 60 && score <= 90){
            System.out.println("Grade B");
        }else if (score >= 90 && score <= 100){
            System.out.println("Grade A");
        }else {
            System.out.println("invalid number");
        }
    }
}
