package day13_Conditional_statements;

public class ATMincodeProgram {
    public static void main(String[] args) {
        System.out.println("*****welcome to TD bank*****");
        int secretpincode= 1234;
        int inputcode = 4321;

        if (secretpincode==inputcode){
            System.out.println("*****Welcome to your account******");
            System.out.println("You can deposit, withdraw and check your balance");
        }else {
            System.out.println("incorrect pincode inputcode: " +inputcode);
            System.out.println("Please try again!");
        }
    }
}
