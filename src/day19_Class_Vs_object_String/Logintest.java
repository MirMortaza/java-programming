package day19_Class_Vs_object_String;

public class Logintest {
    public static void main(String[] args) {
        String expUseName = "cybertek";
        String expPassword = "Abc123";
        String username = "CYBERTEK";
        String password = "Abc123";
        if(expUseName.equalsIgnoreCase(username) && expPassword.equals(password)){
            System.out.println("pass - user logged in  successfully ");
        }else{
            if(expUseName.equalsIgnoreCase(username)){
                System.out.println("invalid username");
            }else {
                System.out.println("fail _ password ");
            }
        }
    }
}
