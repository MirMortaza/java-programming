package Officehours.practuce_04_07_2021;

public class CamelCase {
    public static void main(String[] args){
        String str = "thisHasManyWordToFind";

        int word =1;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) >='A' &&str.charAt(i)<='Z') {
                word++;
            }
        }
        System.out.println("word = " + word);
    }
}
