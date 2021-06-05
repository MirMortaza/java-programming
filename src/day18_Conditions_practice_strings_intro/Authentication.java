package day18_Conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        double explast4SSN =1234;
        int exppincode = 4321;
        int last4ssn = 1234;
        int pinecode= 4321;
        if(last4ssn==explast4SSN&&pinecode==exppincode){
            System.out.println("Authentication");
        }else {
            System.out.println("Authentication unsuccessful");

        }
    }
}
